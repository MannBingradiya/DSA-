import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class OrderedStream{
    int pointer;
    String[] arr;

    public OrderedStream(int n) {
        pointer = 1;
        arr = new String[n + 1];
    }

    public List<String> insert(int idKey, String value) {
        ArrayList<String> al = new ArrayList<>();
        arr[idKey - 1] = value;
        for (int i = pointer; i < arr.length; i++) {
                if (arr[i] != null){
                    al.add(arr[i]);
                }else {
                    pointer = i;
                    break;
                }
            }
        return al;
    }
}
public class Q_1656 {


    public static void main(String[] args) {

        OrderedStream os = new OrderedStream(5);
        System.out.println(os.insert(3,"ccccc"));
        System.out.println(Arrays.toString(os.arr));
        System.out.println(os.insert(1,"aaaaa"));
        System.out.println(Arrays.toString(os.arr));
        System.out.println(os.insert(2, "bbbbb"));
        System.out.println(Arrays.toString(os.arr));
        System.out.println(os.insert(5, "eeeee"));
        System.out.println(Arrays.toString(os.arr));
        System.out.println(os.insert(4, "ddddd"));

    }
}
