package dom4j;

import java.io.*;
import java.util.*;
import org.dom4j.*;
import org.dom4j.io.*;

public class LogWriter {

    private static LogWriter instance;
    private Document document;
    Element root;
    Element latest;

    public static LogWriter getInstance() {
    
        if (LogWriter.instance == null) {
        
            LogWriter.instance = new LogWriter();
                
            // Write data into xml file.
            LogWriter.instance.document = DocumentHelper.createDocument();
            Date d = new Date();
    
            LogWriter.instance.document.setName(d.toString());
    
            LogWriter.instance.root = LogWriter.instance.document.addElement("root");
    
            return LogWriter.instance;
            
        } else {
        
            return LogWriter.instance;
        }
    }
    
    public void addEntry(Element e) {
    
        this.latest = root.addElement("entry");
        Iterator<Element> i = e.elementIterator();
        Element e1 = null;
        String n = null;

        while (i.hasNext()) {
        
            e1 = i.next();
            n = e1.getName();
            
            if (n.equals("title")) {
            
                this.latest.addElement("title").addText(e1.getData().toString());

            } else if (n.equals("updated")) {
            
                this.latest.addAttribute("updated", e1.getText());

            } else if (n.equals("id")) {

                this.latest.addElement("id").addText(e1.getText());

            } else if (n.equals("summary")) {

                this.latest.addElement("summary").addText(e1.getText());
            }
        }
    }
    
    public void writeLogFile() {
    
        try {
        
            OutputFormat f = OutputFormat.createPrettyPrint();
            FileWriter fw = new FileWriter(this.document.getName() + ".xml");
            XMLWriter w = new XMLWriter(fw, f);
            
            w.write(this.document);
            w.close();
            
        } catch (Exception ex) {
        
            System.out.println("An error occured.");
        }
    }
}
