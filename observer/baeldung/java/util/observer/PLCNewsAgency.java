package observer.baeldung.java.util.observer;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class PLCNewsAgency {
    private String news;
    private final PropertyChangeSupport support;

    public PLCNewsAgency() {
        support = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener plc) {
        support.addPropertyChangeListener(plc);
    }

    public void removePropertyChangeListener(PropertyChangeListener plc) {
        support.removePropertyChangeListener(plc);
    }

    public void setNews(String news) {
        support.firePropertyChange("news", this.news, news);
        this.news = news;
    }
}