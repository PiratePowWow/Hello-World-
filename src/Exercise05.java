import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by PiratePowWow on 2/24/16.
 */
public class Exercise05 {
//grab the first 5
    //make them uppercase
        //put ones starting with A in Arraylist
    public static void main(String[] args) {
        String[] names = {"alice", "bob", "charlie", "andrew", "edward", "alex"};
        ArrayList<String> startsWithA = new ArrayList<>();
        List<String> nameList = Arrays.asList(names);
//        for(String name: names){
//            nameList.add(name);
//        }
        int i = 0;
        while (i <= (nameList.size()-2)){
            if (nameList.get(i).startsWith("a")){
                startsWithA.add(nameList.get(i).toUpperCase());
            }
            i++;
        }
        System.out.println(startsWithA);
        System.out.println(nameList);
    }
}
