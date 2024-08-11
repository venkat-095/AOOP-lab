package content;

public class ShareDecorator extends ContentDecorator {

    public ShareDecorator(Content content) {
        super(content);
    }

    @Override
    public String getContent() {
        return content.getContent() + "\nShareable";
    }
}
