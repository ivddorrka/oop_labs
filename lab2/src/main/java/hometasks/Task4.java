package hometasks;
import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    private static int[][] printSpiralOrder(int[] arr, int M, int N)
    {
        if (arr == null) {
            return null;
        }
        int[][] mat = new int[M][N];

        int top = 0, bottom = M - 1;
        int left = 0, right = N - 1;

        int index = 0;

        while (true)
        {
            if (left > right) {
                break;
            }

            // print top row
            for (int i = left; i <= right; i++) {
                mat[top][i] = arr[index++];
            }
            top++;

            if (top > bottom) {
                break;
            }

            // print right column
            for (int i = top; i <= bottom; i++) {
                mat[i][right] = arr[index++];
            }
            right--;

            if (left > right) {
                break;
            }

            // print bottom row
            for (int i = right; i >= left; i--) {
                mat[bottom][i] = arr[index++];
            }
            bottom--;

            if (top > bottom) {
                break;
            }

            // print left column
            for (int i = bottom; i >= top; i--) {
                mat[i][left] = arr[index++];
            }
            left++;
        }

        return mat;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
//        System.out.println(printSpiralOrder(num));

        int numbers = num*num;

        int[] arr;

        arr = new int[numbers];
        arr[0] = 1;
        for(int i = 1; i < numbers; i++){
            arr[i] = i+1;

        }
        System.out.println(Arrays.toString(arr));

        int[][] mat = printSpiralOrder(arr, num, num);
        System.out.println(Arrays.deepToString(mat));
    }
}


