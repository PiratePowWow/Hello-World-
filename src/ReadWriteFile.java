import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by PiratePowWow on 2/10/16.
 */
public class ReadWriteFile {
    public static void main(String[] args) throws IOException {
        File f = new File("names.txt");
        FileWriter fw = new FileWriter(f);
        fw.write("Alice\n");//overwrites file
        fw.append("Bob\n");//appends file
        fw.append("Charlie\n");
        fw.close();//close file must be done before program shuts down as good practice

        Scanner scanner = new Scanner(f);

        //read line-by-line
        while (scanner.hasNext()) { //while there is still unread content
            System.out.println(scanner.nextLine());
        }
        scanner = new Scanner(f);
        scanner.useDelimiter(("\\Z"));// reads entire contents at once and prints
        String contents = scanner.next();
        System.out.println(contents);
    }
}
