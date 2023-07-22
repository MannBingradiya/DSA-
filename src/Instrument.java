public class Instrument {
    public static void main(String[] args) {
//        vehical v1;
        new Bycycale().gare_chnage();
        new Bike().gare_chnage();
        new Car().gare_chnage();
    }
}
class Bycycale implements vehical{

    @Override
    public void gare_chnage() {
        System.out.println("max gare is 2");
    }
}
class Bike implements vehical{
    public void gare_chnage() {
        System.out.println("max gare is 5");
    }
}
class Car implements vehical{
    public void gare_chnage() {
        System.out.println("max gare is 7");
    }
}
interface vehical{
    void gare_chnage();
}
