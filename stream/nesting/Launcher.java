package nesting;

import java.io.*;

public class Launcher {

    public static void main(String[] args) {

        BufferedWriter f;
        String s;
        
        try {
        
            f = new BufferedWriter(new FileWriter("nesting/buffer.txt"));

            for (int i = 1; i <= 10000; ++i) {

                s = "Dies ist die " + i + ". Zeile";
                f.write(s);
                f.newLine();
            }
            
            f.close();
        
        } catch (IOException e) {
        
            System.out.println("Fehler beim Erstellen der Datei");
        }
    }
}
