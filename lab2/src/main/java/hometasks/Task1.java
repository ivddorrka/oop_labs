package hometasks;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        s = compress(s);
        System.out.println(s);
        System.out.println(decompress(s));
    }


    public static String compress(String target){
        int num_letters = target.length();
        String ResultSum = "";
        ResultSum += target.charAt(0);
        int NumChars = 1;
        for (int j = 1; j < num_letters; j++) {
            if (target.charAt(j) == target.charAt(j-1)) {
                NumChars = NumChars + 1;
            } else {
                if(NumChars!=1) {
                    ResultSum += NumChars + "";
                }
                NumChars = 1;
                ResultSum += target.charAt(j);
            }
        }
        if(NumChars!=1) {
            ResultSum += NumChars + "";
        }
        return ResultSum;
    }



    public static String decompress(String target){
        int strLen = target.length();
        String ResSum = "";
        for(int i = 0; i < strLen; i++) {
            char c = target.charAt(i);
            if (Character.isDigit(c)){
                for (int j = 0; j < Character.getNumericValue(target.charAt(i))-1; j++) {
                    ResSum += target.charAt(i-1);
                }
            } else {
                ResSum += target.charAt(i);
            }
        }
        return ResSum;
    }
}