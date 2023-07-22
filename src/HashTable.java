import com.sun.source.tree.UsesTree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HashTable {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 5, 5, 4, 2};
//        int[] arr2 = {1, 1, 2, 4, 4, 6, 7, 7, 5};

        int sum = 10;

        HashSet<Integer> s1 = new HashSet<>();

        for (int aa : arr1){
            s1.add(aa);
        }

        for (int i = 0; i < arr1.length; i++) {
            int diff = sum - arr1[i];
            if (diff != (sum / 2) && s1.contains(diff)){
                System.out.println("true");
                return;
            }
        }
        System.out.println("false");

//        HashSet<Integer> set =  new HashSet<>();
//
//        for (int i = 0; i < arr1.length; i++) {
//            if (set.contains(arr1[i])){
//                System.out.println(arr1[i]);
//            }else {
//                set.add(arr1[i]);
//            }
//        }


//        HashMap<Integer,Integer> map1 = new HashMap<>();
//        HashMap<Integer,Integer> map2 = new HashMap<>();
//
//
//        for (int a1 : arr1){
//            map1.put(a1, map1.getOrDefault(a1, 0) + 1);
//        }
//
//        for (int a2 : arr2){
//            map2.put(a2, map2.getOrDefault(a2, 0) + 1);
//        }
//
//        for (Map.Entry<Integer,Integer> m1 : map1.entrySet()){
//            int temp = m1.getKey();
//            if (!map2.containsKey(temp)){
//                System.out.println("not match");
//                return;
//            }
//        }
//        System.out.println("match");
    }
}
