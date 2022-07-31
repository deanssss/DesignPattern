package xyz.dean.practice.design_pattern.facade.lib;

public class VideoFile {
    private String name;
    private String codecType;

    public VideoFile(String name) {
        this.name = name;
        this.codecType = name.substring(name.indexOf(".") + 1);
    }

    public String getName() { return name; }
    public void setName(String name) {
        this.name = name;
        this.codecType = name.substring(name.indexOf(".") + 1);
    }
    public String getCodecType() { return codecType; }
}
