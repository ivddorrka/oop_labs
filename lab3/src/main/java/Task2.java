import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        /*Write code HERE*/
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt(); // <- 93

        NormalMan man = new NormalMan();
        System.out.println(man.sayAge()); // prints '0'
        changeAge(man, age);
        System.out.println(man.sayAge()); // prints '93'
        /*or HERE*/
    }

    public static void changeAge(Man a, int age) {
        /*HERE*/
        ((NormalMan) a).setNewAge(age);
    }
}

/* even HERE if you want, THIS IS ALL PLACES WHERE YOU CAN WRITE CODE*/


class Man {
    /* but not here */
    private int age;

    public Man() {
        age = 0;
    }

    public Man(int age) {
        this.age = age;
    }

    public int sayAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Man{" +
                "age=" + age +
                '}';
    }
}

class NormalMan extends Man {
    public int newAge = 0;

    public void setNewAge(int newAge) {
        this.newAge = newAge;
    }

    @Override
    public int sayAge() {
        return newAge;
    }
}