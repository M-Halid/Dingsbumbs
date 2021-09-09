package fileinout;

import java.io.*;

public class Launcher {

    public static void main(String[] args) {

        FileReader in = null;
        FileWriter out = null;

        try {
        
            try {

                in = new FileReader("fileinout/testin.txt");
                out = new FileWriter("fileinout/testout.txt");
                int c;

                while ((c = in.read()) != -1) {

                    System.out.print((char) c);
                    out.write(c);
                }

            } catch (FileNotFoundException fe) {
            
                System.out.println("Error: " + fe);

            } finally {
    
                if (in != null) {
                
                    in.close();
                }
                
                if (out != null) {
                
                    out.close();
                }
            }

        } catch (IOException ioe) {
        
            System.out.println("Error: " + ioe);
        }
    }
}
