package linewise;

import java.io.*;

public class Launcher {

    public static void main(String[] args) throws IOException {

        BufferedReader in = null;
        PrintWriter out = null;

        try {
            
            in = new BufferedReader(new FileReader("linewise/testin.txt"));
            out = new PrintWriter(new FileWriter("linewise/testout.txt"));

            String l;
            
            while ((l = in.readLine()) != null) {
                
                out.println(l);
            }
            
            System.out.println("Information: Finished writing to output stream.");
            
        } finally {

            if (in != null) {
                
                in.close();
            }
            
            if (out != null) {
            
                out.close();
            }
        }
    }
}
