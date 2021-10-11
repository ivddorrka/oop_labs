import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String rechennya = scanner.nextLine();
        System.out.println(reverse_str(rechennya));
    }
    public static String reverse_str(String rech){
        String[] splitStr = rech.split("\\s+");
        String result = "";
        for(int i =0; i< splitStr.length; i++){
            splitStr[i] = reverse_word(splitStr[i]);
            if(i!=splitStr.length-1){
                result += splitStr[i];
                result += " ";
            } else{
                result += splitStr[i];
            }
        }
        return result;
    }

    public static String reverse_word(String rech){
        StringBuilder sb=new StringBuilder(rech);
        sb.reverse();
        return sb.toString();
    }
}
