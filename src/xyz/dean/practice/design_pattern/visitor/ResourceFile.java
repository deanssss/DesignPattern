package xyz.dean.practice.design_pattern.visitor;

abstract public class ResourceFile {
    protected String path;
    public ResourceFile(String path) { this.path = path; }
}
