package xyz.dean.practice.design_pattern.facade;

import xyz.dean.practice.design_pattern.facade.facade.VideoConversionFacade;

import java.io.File;

public class Main {
public static void main(String[] args) {
    VideoConversionFacade converter = new VideoConversionFacade();
    File mp4Video = converter.convertVideo("video.ogg", "mp4");
    System.out.println("Extract file: " + mp4Video.getName());
}
}
