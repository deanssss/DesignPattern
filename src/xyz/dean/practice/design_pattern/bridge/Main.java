package xyz.dean.practice.design_pattern.bridge;

public class Main {
public static void main(String[] args) {
    Tv tv = new Tv();
    RemoteControl control = new RemoteControl(tv);
    control.togglePower();
    control.volumeDown();
    System.out.println(tv);

    Radio radio = new Radio();
    AdvancedRemoteControl advancedControl = new AdvancedRemoteControl(radio);
    advancedControl.togglePower();
    advancedControl.mute();
    System.out.println(radio);
}
}
