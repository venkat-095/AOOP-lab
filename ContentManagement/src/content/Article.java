package content;

public class Article extends Content {
    private String title;
    private String body;

    public Article(String title, String body) {
        this.title = title;
        this.body = body;
    }

    @Override
    public String getContent() {
        return "Article: " + title + "\n" + body;
    }
}
