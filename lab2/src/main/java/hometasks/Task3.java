package hometasks;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(calculate(s));

    }


    public static int calculate(String target){
        int StrLen = target.length();
        int NumMistakes = 0;
        for( int i =0; i < StrLen; i++){
            if (i%3==0 || i%3==2){
                if (target.charAt(i) != 'S'){
                    NumMistakes += 1;
                }
            } else {
                if (target.charAt(i) != 'O'){
                    NumMistakes += 1;
                }
            }
        }
        return NumMistakes;
    }
}