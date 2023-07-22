interface print{
    void prints();
}
interface p1 extends print{

}
abstract class bike{
    int type;

    abstract void speed();
    public bike(int type) {
        this.type = type;
    }
    public bike(){}
}
class Honda extends bike{
    void speed(){
        System.out.println("max speed of honda bike is 120");
    }
}
public class Abstracts {
    public static void main(String[] args) {
        bike b1 = new Honda();
        b1.speed();
    }
}
