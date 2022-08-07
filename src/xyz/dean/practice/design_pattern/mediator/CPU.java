package xyz.dean.practice.design_pattern.mediator;

public class CPU extends Component {
    private String videoData, soundData;
    public CPU(Mediator mediator) { super(mediator); }

    public String getVideoData() { return videoData; }
    public String getSoundData() { return soundData; }

    public void decodeData(String data) {
        String[] tmp = data.split(",");
        videoData = tmp[0];
        soundData = tmp[1];
        mediator.changed(this);
    }
}
