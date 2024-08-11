package content;

public abstract class ContentDecorator extends Content {
    protected Content content;

    public ContentDecorator(Content content) {
        this.content = content;
    }
}
