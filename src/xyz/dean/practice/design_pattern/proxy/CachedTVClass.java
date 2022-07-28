package xyz.dean.practice.design_pattern.proxy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CachedTVClass implements ThirdPartyTVLib {
    private ThirdPartyTVLib service;
    private List<String> cachedVideos;
    private final Map<String, String> cachedVideoInfos = new HashMap<>();

    public boolean needReset = false;

    public CachedTVClass(ThirdPartyTVLib service) {
        this.service = service;
    }

    @Override
    public List<String> listVideos() {
        if (needReset || cachedVideos == null) {
            cachedVideos = service.listVideos();
        }
        return cachedVideos;
    }

    @Override
    public String getVideoInfo(String id) {
        if (needReset || cachedVideoInfos.containsKey(id)) {
            cachedVideoInfos.put(id, service.getVideoInfo(id));
        }
        return cachedVideoInfos.get(id);
    }

    public static void main(String[] args) {
        ThirdPartyTVClass tv = new ThirdPartyTVClass();
        CachedTVClass proxy = new CachedTVClass(tv);
        // 第一次向服务请求
        List<String> l1 = proxy.listVideos();
        System.out.println(l1);
        // 第二次直接返回缓存
        List<String> l2 = proxy.listVideos();
        System.out.println(l2);
    }
}
