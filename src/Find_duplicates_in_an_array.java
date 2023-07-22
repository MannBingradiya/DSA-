import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class Find_duplicates_in_an_array {
    public static void main(String[] args) {
//        int[] arr = {13, 9, 25, 1, 1, 0, 22, 13, 22, 20, 3, 8, 11, 25, 10, 3, 15, 11, 19, 20, 2, 4, 25, 14, 23, 14};
        int[] arr = {2, 3, 1, 2, 3, 2};
        int n = 6;
        System.out.println(duplicates(arr, n));
    }

    private static ArrayList<Integer> duplicates(int[] arr, int n) {
        ArrayList<Integer> al = new ArrayList<>();
        int da[] =new int[n];

        for(int i=0;i<n;i++){
                da[arr[i]] +=1;
        }
        for(int i=0;i<n;i++){
            if(da[i]>1){
                al.add(i);
            }
        }
        if(al.size()==0){
            al.add(-1);
        }
        return al;
    }
}
