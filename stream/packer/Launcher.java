package packer;

import java.io.*;
import java.util.zip.*;

public class Launcher {

    public static void main(String[] args) {

        System.out.println("Startup.");

        if (args.length == 1) {

            try {
            
                // The source file name.
                String src = args[0];
                // The destination file name.
                String dest = src + ".zip";
                
                InputStream is = null;
                ZipOutputStream os = null;
                
                try {
                
                    is = new FileInputStream("src");
                    os = new ZipOutputStream(new FileOutputStream(dest));
                    
                    os.putNextEntry(new ZipEntry(src));
                    
                    byte[] buffer = new byte[4096];
                    int length = 0;
                    
                    while ((length = is.read(buffer)) != -1) {
                    
                        os.write(buffer, 0, length);
                    }
    
                } catch (FileNotFoundException ex) {
    
                    System.out.println("Error! The file does not exist.");
                
                } finally {
    
                    is.close();
                    os.close();
                }
    
            } catch (IOException ex) {

                System.out.println("Error! General input/output error.");
            }

        } else {
        
            System.out.println("Verwendung: ...");
        }
        
        System.out.println("Shutdown.");
    }
}
