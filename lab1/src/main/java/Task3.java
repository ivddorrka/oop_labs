import java.util.Scanner;

public class Task3 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String word = sc.nextLine();
        int length_word = word.length();
        int i = 0;
        String new_word = "";
        while (i < length_word) {
            char character = word.charAt(i);
            int num_char = (int)character + 1;
            char new_char = (char)num_char;
            new_word += new_char;
            new_word += "|";
            i++;
        }
        System.out.println(new_word);

    }


    }
