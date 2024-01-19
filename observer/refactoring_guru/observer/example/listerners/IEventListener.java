package observer.refactoring_guru.observer.example.listerners;

import java.io.File;

public interface IEventListener {
    void update(String eventType, File file);
}