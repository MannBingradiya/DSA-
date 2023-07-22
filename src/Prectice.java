import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class Prectice {
    public static void main(String[] args) {
        Character ch = 'c';
        System.out.println(ch);
        int[] arr = {1, 2, 3, 4, 5};
        int[] man = arr.clone();

//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(39);
//        list.add(327);
//        list.add(327);
//        list.add(36);
//
//        list.add(3,74);
//        list.forEach((l) ->{
//            System.out.println(l);
//        });
//        Object[] arrs = list.toArray();
//
//
//        list.add(43);
//        System.out.println(list);
//        System.out.println(Arrays.toString(arrs));
//        List<Integer> list = Stream.iterate(2, i -> i + 2).limit(100).collect(Collectors.toList());
//        System.out.println(list);

//        man[0] = 10;


        String X = "AGGTAB";
        String Y = "GXTXAYB";

        System.out.println(X.length() + " "+ Y.length());

        char chs = X.charAt(X.length() - 1);
        char chs2 = Y.charAt(Y.length() - 1);

        if(X.charAt(X.length() - 1) == Y.charAt(Y.length() - 1)){
            System.out.println(1);
        }

        System.out.println(chs == chs2 ? true : false);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(man));

        System.out.println(sumofNum(5));

        System.out.println(fibo(4));
        System.out.println(fobinum(8));
        }


    private static int fobinum(int i) {
        if(i <= 3) return 1;
        return fobinum(i - 1)  + fobinum(i - 2);

    }

    private static int  fibo(int i) {
        if (i <= 1){
            return i;
        }
        return fibo(i - 1) +
                fibo(i - 2);
    }

    private static int sumofNum(int i) {
        if(i <= 1){
            return 1;
        }
        return i + sumofNum(i - 1);
    }
}
