package checksum;

import java.io.*;
import java.util.zip.*;

public class Launcher {

    public static void main(String[] args) {
        
        try {

            FileInputStream fis = new FileInputStream(args[0]);
            Adler32 a = new Adler32();
            CheckedInputStream in = new CheckedInputStream(fis, a);
            byte[] buf = new byte[2048];
            int len;
            Checksum c = null;
            
            while ((len = in.read(buf)) > 0) {
    
                c = in.getChecksum();
    
                if (c != null) {
                
                    System.out.println(c.getValue());
                   
                } else {
                
                    System.out.println("Error: Checksum is null!");
                }
            }
            
            in.close();
        
        } catch (IOException e) {
        
            System.err.println(e.toString());
        }
    }
}
