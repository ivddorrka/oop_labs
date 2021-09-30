package hometasks;
import java.math.BigInteger;
import java.util.Scanner;


public class Task2 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(number_search(num));
    }

    public static BigInteger number_search(int number){
        BigInteger first = BigInteger.valueOf(0);
        BigInteger second = BigInteger.valueOf(1);
        BigInteger ResNumber = BigInteger.valueOf(1);

        if (number==0){
            return first;
        } else if (number==1){
            return second;
        } else {
            for (int i = 0; i < number; i++) {
                ResNumber = first.add(second);
                second = first;
                first = ResNumber;
            }
        }
        return ResNumber;
    }
}
