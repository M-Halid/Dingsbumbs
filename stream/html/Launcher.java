package html;

import java.io.*;

public class Launcher {

    public static void main(String[] args) {

        if (args.length == 2) {
        
            System.out.println("Eingabedatei: " + args[0]);
            System.out.println("Ausgabedatei: " + args[1]);
           
            try {

                // Die ungepufferten streams.
                FileReader fr = new FileReader(args[0]);
                FileWriter fw = new FileWriter(args[1]);
                // Die gepufferten streams.
                BufferedReader in = null;
                PrintWriter out = null;
        
                try {
    
                    // Erstelle streams.
                    in = new BufferedReader(fr);
                    // Der zweite Parameter setzt automatisches Flush
                    // (ausgeführt z.B. beim Aufruf von "println").
                    out = new PrintWriter(fw, true);
                    // Lies neue Zeile.
                    String line = in.readLine();

                    while (line != null) {

                        line = line.replaceAll("ä", "&auml;");
                        line = line.replaceAll("Ä", "&Auml;");
                        line = line.replaceAll("ö", "&ouml;");
                        line = line.replaceAll("Ö", "&Ouml;");
                        line = line.replaceAll("ü", "&uuml;");
                        line = line.replaceAll("Ü", "&Uuml;");
                        line = line.replaceAll("ß", "&szlig;");
                        line = line.replaceAll("\"", "&quot;");

                        // Schreibe Zeile in Datei.
                        out.println(line);

                        // Lies neue Zeile.
                        line = in.readLine();
                    }

                } finally {

                    // Schließe streams, falls vorhanden.
                    // Wird im Normal- und auch Fehlerfall ausgeführt.
                    if (in != null) {
                        
                        in.close();
                    }
                    
                    if (out != null) {
                     
                        out.close();
                    }
                }

            } catch (IOException e) {
    
                System.err.println(e);
            }

        } else {

            System.out.println("Fehler: Es sind zwei Kommandozeilenargumente erforderlich!");
        }
    }
}
