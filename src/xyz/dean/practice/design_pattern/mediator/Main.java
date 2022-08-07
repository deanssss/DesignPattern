package xyz.dean.practice.design_pattern.mediator;

public class Main {
public static void main(String[] args) {
    MainBoard mainBoard = new MainBoard();
    CPU cpu = new CPU(mainBoard);
    GraphicsCard graphicsCard = new GraphicsCard(mainBoard);
    SoundCard soundCard = new SoundCard(mainBoard);
    CDDrive cdDrive = new CDDrive(mainBoard);

    mainBoard.setCpu(cpu);
    mainBoard.setGraphicsCard(graphicsCard);
    mainBoard.setSoundCard(soundCard);
    mainBoard.setCdDrive(cdDrive);

    cdDrive.load("视频图像流,视频音频流");
}
}
