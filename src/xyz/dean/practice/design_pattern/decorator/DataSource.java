package xyz.dean.practice.design_pattern.decorator;

public interface DataSource {
    void writeData(byte[] data);
    byte[] readData();
}
