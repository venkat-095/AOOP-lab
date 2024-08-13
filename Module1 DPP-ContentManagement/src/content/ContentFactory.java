package content;

public class ContentFactory {
    public static Content createContent(String contentType, String title, String contentDetail) {
        switch (contentType.toLowerCase()) {
            case "article":
                return new Article(title, contentDetail);
            case "video":
                return new Video(title, contentDetail);
            case "image":
                return new Image(title, contentDetail);
            default:
                throw new IllegalArgumentException("Unknown content type");
        }
    }
}
