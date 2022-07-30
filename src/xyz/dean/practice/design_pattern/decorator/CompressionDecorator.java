package xyz.dean.practice.design_pattern.decorator;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class CompressionDecorator extends DataSourceDecorator {
    private final Deflater deflater = new Deflater();
    private final Inflater inflater = new Inflater();
    public CompressionDecorator(DataSource wrappee) { super(wrappee); }

    @Override
    public void writeData(byte[] data) {
        byte[] outData = new byte[0];
        deflater.reset();
        deflater.setInput(data);
        deflater.finish();

        try (ByteArrayOutputStream bout = new ByteArrayOutputStream(data.length)) {
            byte[] buf = new byte[1024];
            while (!deflater.finished()) {
                int i = deflater.deflate(buf);
                bout.write(buf,0, i);
            }
            outData = bout.toByteArray();
        } catch (IOException ignored) { }
        deflater.end();
        wrappee.writeData(outData);
    }

    @Override
    public byte[] readData() {
        byte[] outData = new byte[0];
        byte[] oriData = wrappee.readData();
        inflater.reset();
        inflater.setInput(oriData);

        try (ByteArrayOutputStream bout = new ByteArrayOutputStream(oriData.length)) {
            byte[] buf = new byte[1024];
            while (!inflater.finished()) {
                int i = inflater.inflate(buf);
                bout.write(buf,0, i);
            }
            outData = bout.toByteArray();
        } catch (IOException | DataFormatException ignored) { }
        inflater.end();
        return outData;
    }
}
