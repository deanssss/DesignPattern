package xyz.dean.practice.design_pattern.observer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Editor {
    public EventManager events;
    private File file;

    public Editor() {
        this.events = new EventManager();
    }

    public File openFile(String path) {
        this.file = new File(path);
        events.notify("open", file.getName());
        return file;
    }

    public void saveFile() {
        try(FileOutputStream fout = new FileOutputStream(file);
            OutputStreamWriter writer = new OutputStreamWriter(fout)
        ) {
            writer.append("append.");
            events.notify("save", file.getName());
        } catch (IOException ignored) { }
    }
}
