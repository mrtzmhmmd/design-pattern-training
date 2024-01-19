package observer.refactoring_guru.observer.example;

import observer.refactoring_guru.observer.example.editor.Editor;
import observer.refactoring_guru.observer.example.listerners.impl.EmailNotificationListener;
import observer.refactoring_guru.observer.example.listerners.impl.LogOpenListener;

public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}