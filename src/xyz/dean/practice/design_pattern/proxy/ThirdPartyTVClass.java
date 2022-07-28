package xyz.dean.practice.design_pattern.proxy;

import java.util.ArrayList;
import java.util.List;

public class ThirdPartyTVClass implements ThirdPartyTVLib {
    @Override
    public List<String> listVideos() {
        System.out.println("从远程服务中请求。。。");
        List<String> videos = new ArrayList<>();
        videos.add("霸王别姬");
        videos.add("末代皇帝");
        videos.add("阿凡达");
        videos.add("复仇者联盟5");
        return videos;
    }

    @Override
    public String getVideoInfo(String id) {
        System.out.println("从远程服务中请求。。。");
        return id + "的电影信息。";
    }
}
