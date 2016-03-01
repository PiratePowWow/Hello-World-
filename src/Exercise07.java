import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by PiratePowWow on 3/1/16.
 */
public class Exercise07 {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> names = new ArrayList<>();
        //read the names from the csv into the ArrayList - concat First and Last names
        //String searchTerm = "ali";
        //new ArrayList results contains names matching the string


        File f = new File("people.csv");
        Scanner scanner = new Scanner(f);
        scanner.nextLine();
        while(scanner.hasNext()){
            String[] columns = scanner.nextLine().split("\\,");
            names.add(columns[1] +" " + columns[2]);
        }
        ArrayList<String> results = new ArrayList<>();
        for(String name:names){
            if(name.toLowerCase().contains("ali")){
                results.add(name);
            }

        }
        System.out.println(results);


        //use stream
        results = names.stream()
                .filter((name) -> {
                    return name.toLowerCase().contains("ali");
                })
                .collect(Collectors.toCollection(ArrayList<String>::new));

    }



}
