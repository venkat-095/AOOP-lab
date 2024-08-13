package content;

public class Video extends Content {
    private String title;
    private String url;

    public Video(String title, String url) {
        this.title = title;
        this.url = url;
    }

    @Override
    public String getContent() {
        return "Video: " + title + "\nURL: " + url;
    }
}
