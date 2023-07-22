import java.util.*;

public class Strings {
    public static void main(String[] args) {
//        String str = "this my String";
//        char[] chararr = str.toCharArray();
//        int left = 0, right = str.length() - 1;
//        while (left <= right){
//            char temp = chararr[left];
//            chararr[left] = chararr[right];
//            chararr[right] = temp;
//            left++;
//            right--;
//        }
//        String str1 = "";
//        for (int i = 0; i < chararr.length; i++) {
//            str1 += chararr[i];
//        }
//        System.out.println(str1);

//        String palindrom = "naman";
//        char[] c2 = palindrom.toCharArray();
//
//        int l1 = 0, r1 = palindrom.length() - 1;
//        while (l1 <= r1){
//            if (c2[l1] == c2[r1]){
//                l1++;
//                r1--;
//            }else {
//                System.out.println("String is not palindrom");
//                return;
//            }
//        }
//        System.out.println("String is palindrom");

//        String s2 = "my name is 123";
//        char[] chars = s2.toCharArray();
//
//        int counter = 0;
//        for (int i = 0; i < chars.length; i++) {
//            if (chars[i] >= 65 && chars[i] <= 122){
//                counter++;
//            }
//        }
//        System.out.println(counter);

//        String s3 = "this is dublicate";
//
//        char[] c3 = s3.toCharArray();
//        Set<Character> set = new HashSet<>();
//        ArrayList<Character> list = new ArrayList<>();
//        for (int i = 0; i < c3.length; i++) {
//            if (!set.contains(c3[i])) {
//                set.add(c3[i]);
//            } else if (c3[i] != ' ' && !list.contains(c3[i])) {
//                list.add(c3[i]);
//            }
//        }
//        System.out.println(list);

//        String s5 = "manbca";
//        char[] lc = s5.toCharArray();
//        for (int i = 0; i < lc.length - 1; i++) {
//            for (int j = i + 1; j < lc.length; j++) {
//                if (lc[i] > lc[j]){
//                    char temp = lc[i];
//                    lc[i] = lc[j];
//                    lc[j] = temp;
//                }
//            }
//        }
//        System.out.println(lc);
//        HashMap<Character, Integer> map = new HashMap<>();
//
//        for (char cs : lc){
//            map.put(cs, map.getOrDefault(cs, 0) + 1);
//        }
//        System.out.println(map);

//        String name =  "man naman";
//        HashMap<Character, Integer> map = new HashMap<>();
//        char[] ch =  name.toCharArray();
//        for (char c1 : ch){
//            if (!map.containsKey(c1)){
//                map.put(c1,1);
//            }else {
//                map.put(c1, map.get(c1) + 1);
//            }
//        }
//        System.out.println(map);
    }
}
