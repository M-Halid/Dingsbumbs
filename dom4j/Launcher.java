package dom4j;

public class Launcher {

    public static void main(String[] args) {

        // Read news feed.
        NewsReader r = new NewsReader();
        
        r.readRSSFeed();
        r.readAtomFeed();
    }
}
