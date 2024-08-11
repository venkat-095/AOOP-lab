package content;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {
    @Test
    void testSingletonInstance() {
        ContentManager instance1 = ContentManager.getInstance();
        ContentManager instance2 = ContentManager.getInstance();
        assertSame(instance1, instance2, "ContentManager should be singleton");
    }
}
