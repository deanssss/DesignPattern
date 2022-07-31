package xyz.dean.practice.design_pattern.facade.lib;

import java.io.File;

public class AudioMixer {
    public File fix(VideoFile result) {
        System.out.println("fixing audio...");
        return new File(result.getName());
    }
}
