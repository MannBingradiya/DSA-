import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Map;
import java.util.Scanner;

public class assignment1_2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("man", new int[]{90, 89, 78, 98, 89});
        s1.getName();
        System.out.println("total marks of " + s1.name + " is " + s1.TotalMarks());
        System.out.println("Higest Marks is " + s1.getHigestMarks());
        System.out.println("Lowest Marks is " + s1.getLowestMarks());
        System.out.println("avg " + s1.getAverage());
        System.out.println("total num of sub is passed " + s1.getPassCount());

        Student s2 = new Student();
        s2.setName("mohan", new int[]{87, 89, 48, 98, 85});
        s2.getName();
        System.out.println("total marks of " + s2.name + " is " + s2.TotalMarks());
        System.out.println("Higest Marks is " + s2.getHigestMarks());
        System.out.println("Lowest Marks is " + s2.getLowestMarks());
        System.out.println("avg " + s2.getAverage());
        System.out.println("total num of sub is passed " + s2.getPassCount());
        System.out.println(Student.TotalStudent());

    }
}
class Student{
//    Scanner s1 = new Scanner(System.in);
    static int count;
    int roll_no;
    String name;
    int[] marks;
    int sum;
    public Student(){
        count++;
        this.roll_no = count;
    }

    public void setName(String name,int[] marks) {
        this.name = name;
        this.marks = marks;
    }
    static int TotalStudent(){
        return count;
    }
    public void getName(){
        System.out.print(roll_no + " " + name);
        for (int i = 0; i < marks.length; i++) {
            System.out.print(" " + marks[i]);
        }
        System.out.println();
    }
    int TotalMarks(){
        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }
        return sum;
    }
    int getHigestMarks(){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < marks.length; i++) {
            max = Math.max(marks[i], max);
        }
        return max;
    }
    int getLowestMarks(){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < marks.length; i++) {
            min = Math.max(marks[i], min);
        }
        return min;
    }
    int getAverage(){
        return sum / marks.length;
    }
    int getPassCount(){
        int passCount = 0;
        for (int i = 0; i < marks.length; i++) {
            if(marks[i] > 50) passCount++;
        }
        return passCount;
    }
}