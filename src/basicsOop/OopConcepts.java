package basicsOop;

public class OopConcepts {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.id = 1;
        p1.name = "Man";
        p1.work();
        p1.work(10);
        System.out.println(Person.count);
    }
}
class Developer extends Person{
    public Developer() {
    }

    public Developer(int newid, String newName) {
        super(newid, newName);
    }
}
class Person{
    int id;
    static int count;
    String name;
    public Person(){
        count++;
    }
    public Person(int newid, String newName){
        this();
        id = newid;
        name = newName;
    }


    void work(){
        System.out.println(name + " is working in IT compnies");
    }
    void work(int step){
        System.out.println(name + " walking " + step + " steps");
    }
}
