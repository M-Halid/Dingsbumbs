package filecontent;

import java.io.*;

public class Launcher {

    public static void main(String[] args) {

        try {
        
            FileInputStream in = new FileInputStream("filecontent/testin.txt");
            int c;

            while ((c = in.read()) != -1) {

                System.out.print((char) c);
            }

            in.close();

        } catch (IOException e) {
        
            System.out.println("Error: " + e);
        }
    }
}
