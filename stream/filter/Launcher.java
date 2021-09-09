package filter;

import java.io.*;

class UpCaseWriter extends FilterWriter {

    public UpCaseWriter(Writer out) {

        super(out);
    }

    public void write(int c) throws IOException {

        super.write(Character.toUpperCase((char) c));
    }

    public void write(char[] cbuf, int off, int len) throws IOException {

        for (int i = 0; i < len; ++i) {

            write(cbuf[off + i]);
        }
    }

    public void write(String str, int off, int len) throws IOException {

        write(str.toCharArray(), off, len);
    }
}

public class Launcher {

    public static void main(String[] args) {

        PrintWriter f;
        String s = "und dieser String auch";

        try {

            f = new PrintWriter(new UpCaseWriter(new FileWriter("filter/upcase.txt")));

            // Call from outside.
            f.println("Diese Zeile wird schön groß geschrieben");
            // Test write(int)
            f.write('a');
            f.println();
            // Test write(String)
            f.write(s);
            f.println();
            // Test write(String, int, int)
            f.write(s, 0, 17);
            f.println();
            // Test write(char[], int, int)
            f.write(s.toCharArray(), 0, 10);
            f.println();
            // Close.
            f.close();

        } catch (IOException e) {

            System.out.println("An error occured while creating the file.");
        }
    }
}
