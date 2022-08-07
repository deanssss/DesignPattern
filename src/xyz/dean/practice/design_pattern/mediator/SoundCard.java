package xyz.dean.practice.design_pattern.mediator;

public class SoundCard extends Component {
    public SoundCard(Mediator mediator) { super(mediator); }
    public void play(String data) {
        System.out.println("播放音频：" + data);
    }
}
