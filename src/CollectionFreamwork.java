import java.io.FileOutputStream;
import java.util.*;

public class CollectionFreamwork {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>(3);

        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(1,11);
        hm.put(2,12);
        hm.put(3,13);
        hm.put(4,14);
        System.out.println(hm);


        l1.add("10");
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        Spliterator<Integer> split = list.spliterator();
        split.forEachRemaining(System.out::println);



        System.out.println(l1.size() + " " + list.size());

//        list.add("Man");
//        list.add(10);
//        list.add(Boolean.TRUE);
//        System.out.println(list);
//        l1.add("Naman");
//        l1.add(1,"Man");
//        l1.add(1, "Jigar");
//        l1.set(2,"Mann");
//        List<String> l2 = new ArrayList<>();
//        l2.add("Mann");
//        l2.add("Jigar");
//
        Iterator<String> it1 = l1.iterator();
//        ListIterator<String> it2 = l2.listIterator(2);
//        while (it2.hasPrevious()){
//            String s1 = it2.previous();
//            System.out.println(s1);
//        }
//
//        Collections.sort(l1, Collections.reverseOrder());
//
//        for(String s1 : l1){
//            System.out.println(s1);
//        }
//        l1.forEach(a ->{
//            System.out.println(a);
//        });
//        System.out.println(l1);


        //LinkedList

        LinkedList<String> ll1 = new LinkedList<>();
        ll1.add("Man");
        ll1.add("Naman");
        ll1.add("Jigar");
        ll1.add("Aman");
        ll1.add("Hens");
        ll1.add("Man");
        ll1.removeFirst();
//        Collections.sort(ll1, Collections.reverseOrder());
        Iterator<String> lit1 = ll1.descendingIterator();
        while (lit1.hasNext()){
            System.out.println(lit1.next());
        }
        System.out.println(ll1.offer("Mohan"));
        System.out.println(ll1);
    }
}
