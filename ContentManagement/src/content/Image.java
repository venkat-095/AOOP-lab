package content;

public class Image extends Content {
    private String title;
    private String imagePath;

    public Image(String title, String imagePath) {
        this.title = title;
        this.imagePath = imagePath;
    }

    @Override
    public String getContent() {
        return "Image: " + title + "\nPath: " + imagePath;
    }
}
