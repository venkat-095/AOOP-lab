package content;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContentTest {
    @Test
    void testArticleCreation() {
        Content article = new Article("Title", "Body");
        assertEquals("Article: Title\nBody", article.getContent());
    }

    @Test
    void testVideoCreation() {
        Content video = new Video("Title", "http://url.com");
        assertEquals("Video: Title\nURL: http://url.com", video.getContent());
    }

    @Test
    void testImageCreation() {
        Content image = new Image("Title", "/path/to/image.jpg");
        assertEquals("Image: Title\nPath: /path/to/image.jpg", image.getContent());
    }
}
