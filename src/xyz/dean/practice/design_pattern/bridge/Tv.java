package xyz.dean.practice.design_pattern.bridge;

public class Tv implements Device {
    private boolean isEnable = false;
    private int volume = 50;

    @Override public boolean isEnable() { return isEnable; }
    @Override public void enable() { isEnable = true; }
    @Override public void disable() {isEnable = false; }
    @Override public int getVolume() { return volume; }
    @Override public void setVolume(int volume) { this.volume = volume; }

    @Override
    public String toString() {
        return "Tv{" +
                "isEnable=" + isEnable +
                ", volume=" + volume +
                '}';
    }
}
