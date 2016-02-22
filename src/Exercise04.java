import java.util.*;

/**
 * Created by PiratePowWow on 2/22/16.
 */
public class Exercise04 {
    public static void main(String[] args) {
        String sentence = "To be or not to be, that is the question.";

        sentence = sentence.replace(",", "");
        sentence = sentence.replace(".", "");
        sentence = sentence.toLowerCase();

        String[] sentenceList = sentence.split(" ");

        List<String> sentenceLists = Arrays.asList(sentenceList);

        Set<String> sentenceSet = new LinkedHashSet<>(sentenceLists);
        System.out.println(sentenceSet);
        String noDups = String.join(" ", sentenceSet);
        System.out.println(noDups);



        }
    }
