package console;

import java.io.*;

public class ConsoleToFile {

    public void convert() {

        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        FileWriter fw = null;
        String input = "";

        try {
        
            fw = new FileWriter("test.txt", true);

            do {
    
                input = br.readLine();
    
                if (input.equals("")) {
                
                } else {
                
                    fw.write(input);
                }
    
                fw.close();
                br.close();
                is.close();
    
            } while (input != null);
            
        } catch (IOException ex) {
        
            System.out.println("Error!");
        
        } finally {
        }
    }
}
