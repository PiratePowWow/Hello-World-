import java.util.*;

/**
 * Created by PiratePowWow on 2/25/16.
 */
public class Exercise06 {
    public static void main(String[] args) {
        //Reverse the list order
        //turn it into a HashMap: {"Smith":"Alice",


        String[] names = {"Alice", "Smith", "Bob", "Hope", "Charlie", "Brown"};
        //explanation(names);

        HashMap<String, String> peopleMap = new LinkedHashMap<>();
        for (int i = names.length -1; i > 0 ;i-=2){
            peopleMap.put(names[i],names[i-1]);
        }
        System.out.println(peopleMap);
    }

    public static void explanation(String[] names){
//        String[] reverseNames = new String[names.length];
//        for(int i = names.length-1;i>=0;i--){
//           reverseNames[names.length-i-1] = names[i];
//        }
//        System.out.println(reverseNames);


        ArrayList<String> reversedNames = new ArrayList<>(Arrays.asList(names));
        Collections.reverse(reversedNames);

        HashMap<String, String> nameMap = new HashMap<>();
        for(int i = 0; i<reversedNames.size();i+=2){
            nameMap.put(reversedNames.get(i), reversedNames.get(i+1));
        }
    }

}
