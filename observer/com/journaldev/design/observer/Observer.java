package observer.com.journaldev.design.observer;

public interface Observer {
    void update();

    void setSubject(Subject subject);
}