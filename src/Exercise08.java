import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by PiratePowWow on 3/2/16.
 */
public class Exercise08 {
    public static void main(String[] args) {
        String[] names = {"Charlie", "David", "Alice", "Bob", "Edward"};

        ArrayList<String> sortedNames = new ArrayList<>();
//        int count = 0;
//        while (count!=sortedNames.size()-1){
//            count=0;
//            int i =0;
//            while(i<=sortedNames.size()-2){
//                if(sortedNames.get(i).compareTo(sortedNames.get(i+1))>0){
//                    String smaller = sortedNames.get(i+1);
//                    String bigger = sortedNames.get(i);
//                    sortedNames.set(i, smaller);
//                    sortedNames.set(i+1, bigger);
//                    count = 0;
//                }else{
//                    count++;
//                }
//                i++;
//            }
//        }
//        System.out.println(sortedNames);

        for(String name: names){
            int index = 0;
            for (String sortedName: sortedNames){
                if(name.compareTo(sortedName)>0){
                    index+=1;
                }else{
                    break;
                }
            }
            sortedNames.add(index, name);
        }
        System.out.println(sortedNames);
    }
}
