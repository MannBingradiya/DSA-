import java.util.*;

class Student1 implements Comparable<Student1>{
    int marks;
    String name;

    public Student1(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }

    @Override
    public String toString() {
        return "comparableAndComparators{" +
                "marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Student1 o) {
        return this.marks - o.marks;
    }
}

public class comparableAndComparators {
    public static void main(String[] args) {
        List<Student1> stud = new ArrayList<>();

        stud.add(new Student1(97,"man"));
        stud.add(new Student1(87,"karan"));
        stud.add(new Student1(65,"rohan"));
        stud.add(new Student1(90,"man"));
        stud.add(new Student1(97, "aman"));
//        Collections.sort(stud, (o1, o2) -> {
//            if (o1.name.equals(o2.name)) return o1.marks - o2.marks;
//            else return o1.name.compareTo(o2.name);
//        });
        Collections.sort(stud, Comparator.comparing(Student1::getName).thenComparing(Student1::getMarks));
        stud.forEach(System.out::println);
    }
}

class Cmp implements Comparator<Student1>{

    @Override
    public int compare(Student1 o1, Student1 o2) {
        if (o1.name.equals(o2.name)) return o1.marks - o2.marks;
        else return o1.name.compareTo(o2.name);
    }
}
