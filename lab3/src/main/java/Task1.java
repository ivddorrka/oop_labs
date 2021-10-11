import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(make_an_array(num));
    }

    public static String make_an_array(int number){
        int[][] whole_array = new int[number][];
        int counter = 1;
        for(int i = 0; i<number; i++) {
            whole_array[i] = new int[i + 1];
            for (int j = 0; j < i + 1; j++) {
                whole_array[i][j] = counter;
                counter = counter + 1;
            }
        }
        for(int num = 0; num< whole_array.length; num++) {
            if (num%2==1) {
                whole_array[num] = reverse(whole_array[num]);
            }
        }
        return Arrays.deepToString(whole_array);
    }

    public static int[] reverse(int[] data) {
        int left = 0;
        int right = data.length - 1;

        while( left < right ) {
            int temp = data[left];
            data[left] = data[right];
            data[right] = temp;
            left++;
            right--;
        }
        return data;
    }
}
