import java.util.Scanner;

public class Main {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int num_numbers = sc.nextInt();
        int first = sc.nextInt();
        int num_min = first;
        int num_max = first;
        int sum_numbers = first;
        int product = first;

        for (int i =1; i < num_numbers; i++) {
            int j = sc.nextInt();
            sum_numbers += j;
            if (j > num_max){
                num_max = j;
            }
            if (j < num_min) {
                num_min = j;
            }
            product *= j;
        }
        System.out.println(num_max);
        System.out.println(num_min);

        float result = ((float)sum_numbers) / ((float)num_numbers);
        if (((float)sum_numbers) % ((float)num_numbers) == 0.0){
            System.out.println((int)result);

        } else {
            System.out.format("%.2f%n",result);
        }
        System.out.println(sum_numbers);
        System.out.println(product);
    }
}
