package observer.medium;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel {
    List<Subscriber> subscriberList;
    private final List<String> videoTitles;

    public YouTubeChannel() {
        subscriberList = new ArrayList<>();
        videoTitles = new ArrayList<>();
    }

    public void attachSubscribers(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    public void addVideo(String title) {
        videoTitles.add(title);
        broadcastToSubscribers();
    }

    public void broadcastToSubscribers() {
        for (Subscriber subscriber: subscriberList) {
            subscriber.getUpdate();
        }
    }

    public List<String> getVideoTitles() {
        return videoTitles;
    }
}
