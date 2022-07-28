package xyz.dean.practice.design_pattern.proxy;

import java.util.List;

public interface ThirdPartyTVLib {
    List<String> listVideos();
    String getVideoInfo(String id);
}
