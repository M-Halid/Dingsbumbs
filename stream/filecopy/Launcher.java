package filecopy;

import java.io.*;

public class Launcher {

    public static void main(String[] args) {

        if (args.length != 2) {
        
            System.out.println("java Launcher inputfile outputfile");
            System.exit(1);
        }

        try {

            FileInputStream in = new FileInputStream(args[0]);
            FileOutputStream out = new FileOutputStream(args[1]);
            byte[] buf = new byte[4096];
            int len;
            
            while ((len = in.read(buf)) > 0) {
            
                out.write(buf, 0, len);
            }
            
            out.close();
            in.close();

        } catch (IOException e) {
        
            System.err.println(e.toString());
        }
    }
}
