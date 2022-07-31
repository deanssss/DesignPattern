package xyz.dean.practice.design_pattern.facade.facade;

import xyz.dean.practice.design_pattern.facade.lib.*;

import java.io.File;

public class VideoConversionFacade {
    /** 视频编码转换的门面接口 */
    public File convertVideo(String sourceFileName, String target) {
        System.out.println("conversion started.");
        VideoFile file = new VideoFile(sourceFileName);
        Codec sourceCodec = CodecFactory.extract(file.getCodecType());
        Codec destinationCodec = CodecFactory.extract(target);
        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
        File result = new AudioMixer().fix(intermediateResult);
        System.out.println("conversion completed.");
        return result;
    }
}
