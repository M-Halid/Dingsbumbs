package dom4j;

import java.io.*;
import java.net.*;
import java.util.*;
import org.dom4j.*;
import org.dom4j.io.*;

public class NewsReader {

    private Document document;
    private Element root;

    public void readRSSFeed() {
    
        SAXReader r = new SAXReader();
        
        try {
        
            // The news feed source may be of type File or URL.
            File f = new File("news/heise.rdf");
//            URL f = new URL("file:///home/user/exercise/xml/dom4j/heise.rdf");
//            URL f = new URL("http://www.heise.de/newsticker/heise.rdf");
            this.document = r.read(f);
            this.root = this.document.getRootElement();
            Iterator<Element> i = root.elementIterator();
            Iterator<Element> j = null;
            Element e = null;
            Element e2 = null;
            
            while (i.hasNext()) {
            
                e = i.next();
                
                if (e.getName().equals("item")) {
                
                    System.out.println(e.getName());
                    
                    j = e.elementIterator();
                    
                    while (j.hasNext()) {
                    
                        e2 = j.next();
                        
                        System.out.println(e2.getName() + " - " + e2.getText());
                    }
                }
            }
        
        } catch (Exception ex) {
        
            System.out.println("Could not read RSS feed: " + ex);
        }
    }

    public void readAtomFeed() {
    
        SAXReader r = new SAXReader();
        LogWriter w = LogWriter.getInstance();
        
        try {

            // The news feed source may be of type File or URL.
            java.io.File f = new java.io.File("news/heise-atom.xml");
//            URL f = new URL("file:///home/user/exercise/xml/dom4j/heise-atom.xml");
//            URL f = new URL("http://www.heise.de/newsticker/heise-atom.xml");
            this.document = r.read(f);
            this.root = this.document.getRootElement();
            Iterator<Element> i = root.elementIterator();
            Iterator<Element> j = null;
            Element e = null;
            Element e2 = null;
            
            while (i.hasNext()) {
            
                e = i.next();
                
                if (e.getName().equals("entry")) {
                
                    System.out.println(e.getName());

                    w.addEntry(e);
                    
                    j = e.elementIterator();
                    
                    while (j.hasNext()) {
                    
                        e2 = j.next();
                        
                        if (e2.getName().equals("link")) {
                        
                            System.out.println("\t" + e2.getName() + " - " + e2.attributeValue("href"));
                            
                        } else {
                        
                            System.out.println("\t" + e2.getName() + " - " + e2.getText());
                        }
                    }
                }
            }
        
        } catch (Exception ex) {
        
            System.out.println("Could not read Atom feed: " + ex);
        }

        w.writeLogFile();
    }
}
