package xyz.dean.practice.design_pattern.facade.lib;

public class CodecFactory {
    public static Codec extract(String type) {
        if (type.equals("mp4")) {
            System.out.println("Extracting mpeg audio...");
            return new MPEG4CompressionCodec();
        } else {
            System.out.println("Extracting ogg audio...");
            return new OggCompressionCodec();
        }
    }
}
