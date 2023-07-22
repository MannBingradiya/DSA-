class Animal {

    public int key;
    public String name;

//    Animal(int key, String name){
//        this.key = key;
//        this.name = name;
//    }
//
//    Animal(Animal copy){
//        this.key = copy.key;
//        this.name = copy.name;
//    }
    void getData(int animalKey, String animalname){
        key = animalKey;
        name = animalname;
    }

    void display(){
        System.out.println(key + " " + name);
    }
     void eat() {
        System.out.println("helli is a eating");
    }
}
class Dog extends Animal{

    void run(float f, int i){
        System.out.println("dog is run faster");
    }
    void run(int i, String f){
        System.out.println("dog is run faster " + i);
    }

    public void eat() {
        System.out.println("helli is a eating banana");
    }

}
public class Oops extends Dog{

    public void eat() {
        System.out.println("helli is a eating apple");
    }

    public static void main(String[] args) {
//        Animal eat;
//        eat = new Animal(3, "elephent");
//        eat.eat();
//
//        eat.key = 1;
//        eat.name = "lion";
//        System.out.println(eat.key + " " + eat.name);
//
//        Animal obj = new Animal(4, "monkey");
//        obj.getData(2,"Tiger");
//        obj.display();

//        Animal cpoyobj = new Animal(obj);
//        cpoyobj.display();

        Oops oop = new Oops();
        oop.run(10, "man");
        oop.run(10.29f, 10);
        main(2);
        oop.eat();
    }

    public static void main(int n) {
        System.out.println("2");
    }
}
