package encapsulation;

public class Encapsulations {
    public static void main(String[] args) {
        Laptop l1 = new Lanovo();
        l1.open();
    }
}
class Lanovo extends Laptop{
    void open(){
        System.out.println("Lanovo system is open");
    }
}
class Hp extends Laptop{
    void open(){
        System.out.println("Hp system is open");
    }
}
abstract class Laptop{
    int model_no;
    int price;
    abstract void open();
//    void setPrice(int price){
//        boolean is_Admin = false;
//        if (is_Admin){
//            System.out.println("cant chang the price");
//        }else {
//            this.price = price;
//        }
//    }
}
