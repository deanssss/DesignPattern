package xyz.dean.practice.design_pattern.mediator;

public class Component {
    protected Mediator mediator;
    public Component(Mediator mediator) { this.mediator = mediator; }
}
