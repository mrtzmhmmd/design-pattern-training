package observer.baeldung.java.util.observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class PLCNewsChannel implements PropertyChangeListener {
    private String news;

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        this.setNews((String) evt.getNewValue());
    }

    public void setNews(String news) {
        this.news = news;
    }

    public String getNews() {
        return news;
    }
}
