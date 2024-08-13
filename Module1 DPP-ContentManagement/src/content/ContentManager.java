package content;

public class ContentManager {
    private static ContentManager instance;

    private ContentManager() {}

    public static synchronized ContentManager getInstance() {
        if (instance == null) {
            instance = new ContentManager();
        }
        return instance;
    }
}
