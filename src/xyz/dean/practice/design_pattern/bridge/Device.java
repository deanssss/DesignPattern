package xyz.dean.practice.design_pattern.bridge;

public interface Device {
    boolean isEnable();
    void enable();
    void disable();
    int getVolume();
    void setVolume(int volume);
}
