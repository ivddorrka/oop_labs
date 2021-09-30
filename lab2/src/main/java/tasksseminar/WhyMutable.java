package tasksseminar;

public class WhyMutable {
    public static void main(String[] args){
        String name = "Parker";
        Double sal = 60008.80;
        displayTax(name, sal);
        System.out.println(name + " You have to pay tax $" + sal);
    }

    static void displayTax(String name, Double sal) {
        name = "Hello " + name.concat("!");
        sal = sal*30 /100;
        System.out.println(name + " You have to pay tax $" + sal);
    }
}
