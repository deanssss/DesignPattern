package xyz.dean.practice.design_pattern.decorator;

import java.nio.charset.StandardCharsets;

public class Main {
public static void main(String[] args) {
    DataSource dataSource = getDataSource(true, true);
    String msg = "Original data string.";
    dataSource.writeData(msg.getBytes(StandardCharsets.UTF_8));
    byte[] b = dataSource.readData();
    String readMsg = new String(b);
    System.out.println(readMsg);
}

private static DataSource getDataSource(boolean withEncrypt, boolean withCompress) {
    DataSource f = new FileDataSource("data.text");
    if (withEncrypt) f = new EncryptionDecorator(f);
    if (withCompress) f = new CompressionDecorator(f);
    return f;
}
}
