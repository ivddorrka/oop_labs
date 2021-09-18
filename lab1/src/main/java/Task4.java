import java.util.Scanner;

public class Task4 {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        String new_char = "";
        int char_num = 0;
        while (sc.hasNextLine()){
            String wordInput = sc.nextLine();
            char word = wordInput.charAt(0);
            char_num = (int)word;
            new_char = word + "=" + char_num;
            System.out.println(new_char);
        }
    }
}
