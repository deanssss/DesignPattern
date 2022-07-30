package xyz.dean.practice.design_pattern.decorator;

public abstract class DataSourceDecorator implements DataSource {
    protected DataSource wrappee;
    public DataSourceDecorator(DataSource wrappee) { this.wrappee = wrappee; }
}
