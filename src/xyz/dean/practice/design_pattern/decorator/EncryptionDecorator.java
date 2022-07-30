package xyz.dean.practice.design_pattern.decorator;

public class EncryptionDecorator extends DataSourceDecorator {
    public static final byte E = 'd';
    public EncryptionDecorator(DataSource wrappee) { super(wrappee); }

    @Override
    public void writeData(byte[] data) {
        byte[] newData = new byte[data.length];
        for (int i = 0; i < data.length; i++) {
            newData[i] = ((byte) (data[i] ^ E));
        }
        wrappee.writeData(newData);
    }

    @Override
    public byte[] readData() {
        byte[] data = wrappee.readData();
        byte[] newData = new byte[data.length];
        for (int i = 0; i < data.length; i++) {
            newData[i] = ((byte) (data[i] ^ E));
        }
        return newData;
    }
}
