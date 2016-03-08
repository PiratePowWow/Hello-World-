import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by PiratePowWow on 3/8/16.
 */
public class Exercise09 {

    public static void main(String[] args) {
        int num = 12345;
        useMath(num);

//        //...
//        // int newNum = 54321;
//        int newNum;
//
//        String numStr = String.valueOf((Integer) num);
//        StringBuffer buff = new StringBuffer(numStr);
//
//        numStr = buff.reverse().toString();
////        int i = 0;
////        String[] numsPrim = numStr.split("");
////        ArrayList<String> nums = new ArrayList<>(Arrays.asList(numsPrim));
////        while (i<numStr.length()){
////            String newChar = ((Integer) (nums.size() + 1 - Integer.valueOf(nums.get(i)))).toString();
////            nums.set(i, newChar);
////            i++;
////        }
//        StringBuffer buff = new StringBuffer(numStr);
//        newNum = Integer.valueOf(numStr);
//
//        System.out.println();
    }

    public static void userLoop(int num){
        String numStr = String.valueOf(num);
        String newNumStr = "";
        for(int i =numStr.length() - 1;i>=0;i--){
            newNumStr += numStr.charAt(i);
        }
        int newNum = Integer.valueOf(newNumStr);
        System.out.println(newNum);
    }

    public static void useReverse(int num){
        String numStr = String.valueOf(num);
        numStr = new StringBuilder(numStr).reverse().toString();
        int newNum = Integer.valueOf(numStr);
    }

    public static void useMath(int num){
        int newNum = 0;
        int rem;
        while(num>0){
            rem = num % 10;
            num = num / 10;
            newNum = newNum * 10 + rem;
        }
        System.out.println(newNum);
    }
}
