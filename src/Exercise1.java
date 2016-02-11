import java.lang.*;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by PiratePowWow on 2/11/16.
 */
public class Exercise1 {


    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David", "Edward", "Albert", "Beth"};
        HashMap<java.lang.Character, ArrayList<String>> nameMap = new HashMap<>();

        //create empty array lists
        for (String name: names) {
            char firstLetter = name.charAt(0);
            nameMap.put(firstLetter, new ArrayList<>());
        }

        //add names
        for (String name: names) {
            nameMap.get(name.charAt(0)).add(name);
        }

        System.out.println(nameMap);


    }
}
