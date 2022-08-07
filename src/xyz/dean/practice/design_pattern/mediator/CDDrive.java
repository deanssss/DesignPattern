package xyz.dean.practice.design_pattern.mediator;

public class CDDrive extends Component {
    private String data;
    public CDDrive(Mediator mediator) { super(mediator); }

    public String read() { return data; }
    public void load(String data) {
        this.data = data;
        mediator.changed(this);
    }
}
