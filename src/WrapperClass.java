public class WrapperClass {
    public static void main(String[] args) {
        Integer i = Integer.valueOf("142 ");
        int ib = Integer.valueOf("101",2);
        double d = Double.valueOf("18.29");
        double pi = Double.parseDouble("847.8");

        int c = i.intValue();
        System.out.println(c);
        System.out.println(i.SIZE);
        System.out.println(d);
        System.out.println(ib);
        System.out.println(pi);
    }
}
