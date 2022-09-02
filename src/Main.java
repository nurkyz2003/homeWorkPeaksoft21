import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("simvolsAndDigits.txt");
        for (int a = 65, b = 97; a < 91; a++) {
            writer.write(a);
            writer.write(' ');
            writer.write(b);
            b++;
            writer.write('\n');
        }
        for (int j = 48; j < 58; j++) {
            writer.write(j);
            writer.write('\n');
        }
        writer.close();

        FileReader fileReader = new FileReader("simvolsAndDigits.txt");
        Scanner scanner = new Scanner(fileReader);
        int i = 1;
        while (scanner.hasNextLine()){
            System.out.println(i + ": " + scanner.nextLine());
            i++;
        }
        fileReader.close();
    }
}