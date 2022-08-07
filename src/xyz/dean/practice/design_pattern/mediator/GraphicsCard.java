package xyz.dean.practice.design_pattern.mediator;

public class GraphicsCard extends Component {
    public GraphicsCard(Mediator mediator) { super(mediator); }

    public void play(String data) {
        System.out.println("播放视频：" + data);
    }
}
