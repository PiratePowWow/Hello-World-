import org.springframework.util.StopWatch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Collectors;

/**
 * Created by PiratePowWow on 2/24/16.
 */
public class Exercise05Explained {
    public static void main(String[] args) {
        //Return list containing only the names that start with "A", converted to uppercase, and only look at the first 5 names
        String[] names = {"alice", "bob", "charlie", "andrew", "edward", "alex"};
        ArrayList<String> newNames = new ArrayList<>(Arrays.asList(names));
        newNames = new ArrayList<>(newNames.subList(0, 5));


        //methods used to solve
        StopWatch stopwatch = new StopWatch();
        stopwatch.start("stream");
        solveViaStream(newNames);
        stopwatch.stop();
        System.out.println(stopwatch);
        stopwatch = new StopWatch();
        stopwatch.start("direct");
        solveViaDirectModification(newNames);
        stopwatch.stop();
        System.out.println(stopwatch);
        stopwatch = new StopWatch();
        stopwatch.start("temp");
        solveViaTempLists(newNames);
        stopwatch.stop();
        System.out.println(stopwatch);



    }
    static void solveViaDirectModification(ArrayList<String> names){
        for (int i = 0; i < names.size(); i++){
            names.set(i, names.get(i).toUpperCase());
        }
        Iterator<String> iter = names.iterator();
        while (iter.hasNext()){
            String name = iter.next();
            if (!name.startsWith("A")){
                iter.remove();
            }
        }


        System.out.println(names);
    }

    static void solveViaTempLists(ArrayList<String> names){
        ArrayList<String> temp = new ArrayList<>();
        for (String name: names) {
            temp.add(name.toUpperCase());
        }
        names = temp;
        temp = new ArrayList<>();
        for (String name: names){
            if (name.startsWith("A")){
                temp.add(name);
            }
        }
        System.out.println(temp);
    }

    static void reverseIteration(ArrayList<String> names){
        //int size =

    }

    static void solveViaStream(ArrayList<String> names){
        names = names.stream()
                .map(String::toUpperCase)
                .filter((name) -> {
                    return name.startsWith("A");
                })
                .collect(Collectors.toCollection(ArrayList<String>::new));

        System.out.println(names);
    }


}
