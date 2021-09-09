package console;

public class Launcher {
    
    public static void main(String[] args) {
    
        System.out.println("Startup.");

        System.out.println("Bitte geben Sie Ihre Daten ein!");

        ConsoleToFile ctf = new ConsoleToFile();
        
        ctf.convert();

        System.out.println("Shutdown.");
    }
}
