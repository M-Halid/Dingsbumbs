package fileoutput;

import java.io.*;

public class Launcher {

    public static void main(String[] args) {

        try {

            // Use byte-based stream.
            
            // Create a file output stream to write to the given file.
            // If the second argument is "true", the data will be
            // appended to the end of the file.
            FileOutputStream out = new FileOutputStream(args[0], true);
        
            for (int i = 0; i < 256; i++) {
            
                out.write(i);
            }

            out.close();

            // Use character-based stream.
            
            FileWriter w = new FileWriter(args[1], false);

            for (int i = 0; i < 256; i++) {
            
                w.write(Integer.toString(i) + "\n");
            }
        
            w.close();

        } catch (Exception e) {

            System.err.println(e.toString());
            System.exit(1);
        }
    }
}
