import java.util.Base64;

class Stud{
    int id;
    String name;

    public Stud(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Stud(Stud s){
        this.id = s.id;
        this.name = s.name;
    }
    private void displayrec(){
        System.out.println(id + " " + name);
    }

    public Stud(){}


    void insertRec(int ids){
        id = ids;
    }
    void displayRec(){
        System.out.println(id + " " + name);
    }
}
class School extends Stud{
    static {
        System.out.println("this is school class");
    }
    int id;
    static int inc;
//    final int Branch;
    static String name = "Tapovan Vidhyabhavan";

    public School(String name) {
        this.name = name;
    }
    public School(String name, int x){
        this(name);
        System.out.println("x" + x);
    }
    School(){
//        Branch = 2;
        inc++;
        System.out.println(inc);
    }

    public static void change(){
        name = "Aspire public school";
//        System.out.println(id);
        System.out.println(name);
    }

    void insertRec(int ids){
        id = ids;
    }
//    void displayrec(){
//        System.out.println(name + " " + id);
//    }
}

public class Oop {
    public static void main(String[] args) {
//        new School().displayrec();
        School sc1 = new School("P.P Savani",10);
        School sc3 = new School();
//        School sc4 = (School) new Stud();
        School sc2 = new School("Aspire public school");

        sc3.change();

        Stud s1 = new Stud(), s2 = new Stud();
        Stud s3 = new Stud(10, "Man");
//        s1.id = 1;
//        s2.id = 2;
        s3.displayRec();
//        s1.insertRec(3);
//        s3.displayRec();
//        System.out.println(s1.id + " " + s2.id);
    }
}
