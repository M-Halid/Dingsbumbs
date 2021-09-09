package filecreation;

import java.io.*;

public class Launcher {

    public static void main(String[] args) {

        System.out.println("Startup.");
        
        String hello = "What a beautiful morning ...\r\n";
        
        try {
        
            FileWriter f1 = new FileWriter("filecreation/test.txt");
            
            f1.write(hello);
            f1.close();
        
        } catch (IOException e) {
        
            System.out.println("An error occured!");
        }
    }
}
