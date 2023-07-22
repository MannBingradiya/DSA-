import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringRecursion {
    public static void main(String[] args) {
        String str = "acba";
        int first = 0, last = str.length() - 1;
//        System.out.println(palindrom(str, first, last));
        String str2 = "abc";
        int i = 0;
        String s1 = "";
        int[] arr = new int[str2.length() * (str2.length() + 1) / 2];
//        subsetOfString(str2, i, s1);
        String str3 = "abc";
        int fp = 0, lp = str3.length() - 1;
        long num = 8767523418L;

//        permutation(str3,fp,lp);
    }

//    private static void permutation(String str3, int fp, int lp) {
//        if (fp == lp){
//            System.out.println(str3);
//            return;
//        }
//        for (int i = fp; i < lp; i++) {
//
//        }
//    }

//    private static void subsetOfString(String str2, int i, String arr) {
//        if (i == str2.length()){
//            System.out.println(arr);
//            return;
//        }
//        subsetOfString(str2, i + 1, arr + str2.charAt(i));
//        subsetOfString(str2,i + 1, arr);
//    }


//    private static boolean palindrom(String str, int first, int last) {
//        if (first >= last ){
//            return true;
//        }
//        if (str.charAt(first) != str.charAt(last)) {
//            return false;
//        }
//        return palindrom(str, first + 1, last - 1);
//    }
}
