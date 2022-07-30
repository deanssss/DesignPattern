package xyz.dean.practice.design_pattern.decorator;

import java.io.*;

public class FileDataSource implements DataSource {
    private final File file;

    public FileDataSource(String filePath) {
        file = new File(filePath);
        if (!file.exists()) {
            try {
                //noinspection ResultOfMethodCallIgnored
                file.createNewFile();
            } catch (IOException ignored) { }
        }
    }

    @Override
    public void writeData(byte[] data) {
        try(OutputStream fout = new FileOutputStream(file)) {
            fout.write(data);
        } catch (IOException ignored) { }
    }

    @Override
    public byte[] readData() {
        byte[] data = null;
        try(InputStream fin = new FileInputStream(file)) {
            data = fin.readAllBytes();
        } catch (IOException ignored) { }
        return data;
    }
}
