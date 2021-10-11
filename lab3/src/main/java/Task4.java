import java.util.Scanner;


interface Learnable {
    void learn();
}

abstract class Human{
    public int age;

    public Human(){
        age = 0;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

}

class Student extends Human implements Learnable {
    private String name;
    private String gender;

    public Student(){
        name = "";
        gender = "";
    }

    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public Student(int age, String name, String gender){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public String getGender(){
        return gender;
    }

    public int getAge(){
        return age;
    }

    @Override
    public void learn(){
        System.out.println("AHAHAHAHAH");
    }

}

public class Task4 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = sc.nextInt();
        Student st;
        if (choice == 0) {
            st = new Student();
            System.out.println((st instanceof Learnable) && (st instanceof Human));
        } else if (choice == 1) {
            st = new Student(18, "Oleh", "male");
            System.out.println(st);
        } else if (choice == 2) {
            Human hm = new Student();
            System.out.println(hm.getAge());
        }
    }
}