class Add{
    String city,state;

    public Add(String city, String state) {
        this.city = city;
        this.state = state;
    }
}
class Emp{
    int id;
    String name;
    Add add;

    public Emp() {

    }

    static int add(int a,int b){
        return a + b;
    }
    static double add(double a,double b,double c){
        return a + b + c;
    }
    public Emp(int id, String name, Add add) {
        this.id = id;
        this.name = name;
        this.add = add;
    }
    void add(int a, int b,int c){
        System.out.println(a + b + c);
    }
    void add(long a, long b,long c){
        System.out.println(a + b + c);
    }
    void display(){
        System.out.println(id + " " + name + " " + '\n' + add.city);
    }
}

public class Aggrigations {

    public static void main(String[] args) {
        Add a1 = new Add("surat", "Gujrat");
        new Emp(1,"Ashish",a1).display();
        Emp e1 = new Emp();
        System.out.println(Emp.add(10,10));
        System.out.println(Emp.add(10.0,10,10));
        System.out.println(e1.add(10,40));
    }
}
