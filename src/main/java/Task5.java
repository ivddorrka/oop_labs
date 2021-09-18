import java.util.Scanner;

public class Task5 {
    public static Scanner sc = new Scanner(System.in);

    static boolean compareWords(String a, String b) {
        if (a.equals(b)) {
            return true;
        } else {
            return (false);
        }
    }

    public static void main(String[] args) {
        String wordOne = sc.nextLine();
        String wordTwo = sc.nextLine();
        System.out.println(compareWords(wordOne, wordTwo));
    }
}
