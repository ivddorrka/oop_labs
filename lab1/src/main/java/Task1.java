import java.util.Scanner;

public class Task1 {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int num_numbers = sc.nextInt();
        int result_number = num_numbers;
        System.out.println(num_numbers);

        while (result_number != 1) {
            if ((float)result_number % 2 == 1.0) {
                result_number = result_number * 3 + 1;
                System.out.println(result_number);

            } else {
                result_number = result_number / 2;
                System.out.println(result_number);

            }
        }
    }
}
