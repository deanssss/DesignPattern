package xyz.dean.practice.design_pattern.facade.lib;

public class BitrateReader {
    public static VideoFile read(VideoFile file, Codec codec) {
        System.out.println("reading file...");
        return file;
    }

    public static VideoFile convert(VideoFile buffer, Codec codec) {
        System.out.println("writing file...");
        String name = buffer.getName().replace(buffer.getCodecType(), codec.getType());
        buffer.setName(name);
        return buffer;
    }
}
