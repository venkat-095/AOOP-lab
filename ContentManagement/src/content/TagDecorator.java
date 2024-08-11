package content;

public class TagDecorator extends ContentDecorator {
    private String tag;

    public TagDecorator(Content content, String tag) {
        super(content);
        this.tag = tag;
    }

    @Override
    public String getContent() {
        return content.getContent() + "\nTags: " + tag;
    }
}
