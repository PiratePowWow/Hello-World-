import org.springframework.util.StopWatch;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by PiratePowWow on 3/10/16.
 */
public class Exercise10 {


    public static void main(String[] args) {
        String palindrome = "racecar";
        String nonPalindrome = "hello";
        StopWatch stopwatch = new StopWatch();
        stopwatch.start("stringbuilder");
        if ((isPalindrome(palindrome))&&!isPalindrome(nonPalindrome)){
            System.out.println("IT WORKS!");
        }else{
            System.out.println("FAIL!");
        }
        stopwatch.stop();
        System.out.println(stopwatch);
        stopwatch = new StopWatch();
        stopwatch.start("while");
        if ((isPalindromeAgain(palindrome))&&!isPalindromeAgain(nonPalindrome)){
            System.out.println("IT WORKS!");
        }else{
            System.out.println("FAIL!");
        }
        stopwatch.stop();
        System.out.println(stopwatch);
    }

    public static boolean isPalindrome( String s){
        String reverse = new StringBuilder(s).reverse().toString();
        if (reverse.equals(s)){
            return true;
        }else {
            return false;
        }
    }

    public static boolean isPalindromeAgain(String s){

        int i = 0;
        while(i<s.length()/2){
            if(s.charAt(i) != (s.charAt(s.length()- i - 1))){
                return false;
            }
            i++;
        }
        return true;
    }
}
