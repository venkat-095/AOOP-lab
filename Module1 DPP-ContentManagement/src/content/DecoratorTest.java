package content;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DecoratorTest {
    @Test
    void testTagDecorator() {
        Content article = new Article("Title", "Body");
        Content taggedArticle = new TagDecorator(article, "Java, Programming");
        assertEquals("Article: Title\nBody\nTags: Java, Programming", taggedArticle.getContent());
    }

    @Test
    void testShareDecorator() {
        Content video = new Video("Title", "http://url.com");
        Content shareableVideo = new ShareDecorator(video);
        assertEquals("Video: Title\nURL: http://url.com\nShareable", shareableVideo.getContent());
    }
}
