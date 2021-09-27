import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Import your library
// Do not change the name of the Solution class
public class gcd {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("data.txt");
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            System.out.println(line);
        }
        System.out.println("haha");
    }
}