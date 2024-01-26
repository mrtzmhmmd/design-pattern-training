package observer.medium;

import java.util.Arrays;
import java.util.List;

public class PremiumSubscriber implements Subscriber {
    private final YouTubeChannel youTubeChannel;

    public PremiumSubscriber(YouTubeChannel youTubeChannel) {
        this.youTubeChannel = youTubeChannel;
        this.youTubeChannel.attachSubscribers(this);
    }

    @Override
    public void getUpdate() {
        List<String> videoTitles = this.youTubeChannel.getVideoTitles();
        System.out.println(this.getClass().getSimpleName()
                + " :> "
                + Arrays.toString(videoTitles.toArray()));
    }
}
