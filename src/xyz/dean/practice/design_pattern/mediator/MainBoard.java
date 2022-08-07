package xyz.dean.practice.design_pattern.mediator;

public class MainBoard extends Mediator {
    private CPU cpu;
    private GraphicsCard graphicsCard;
    private SoundCard soundCard;
    private CDDrive cdDrive;

    public void setCpu(CPU cpu) { this.cpu = cpu; }
    public void setGraphicsCard(GraphicsCard graphicsCard) { this.graphicsCard = graphicsCard; }
    public void setSoundCard(SoundCard soundCard) { this.soundCard = soundCard; }
    public void setCdDrive(CDDrive cdDrive) { this.cdDrive = cdDrive; }

    @Override
    public void changed(Component c) {
        if (c == cdDrive) {
            handleCD(cdDrive);
        }
        if (c == cpu) {
            handleCPU(cpu);
        }
    }

    private void handleCD(CDDrive cd) { cpu.decodeData(cd.read()); }
    private void handleCPU(CPU cpu) {
        soundCard.play(cpu.getSoundData());
        graphicsCard.play(cpu.getVideoData());
    }
}
