package hometasks;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int[] arr;
        int[] arr_in_arr;
        arr = new int[rows*columns];
        arr_in_arr = new int[columns];
        for (int i = 0; i< rows*columns; i++){
            int num = scanner.nextInt();
            arr[i]=num;
        }
        int first = 0;
        int second = columns;
        int[][] arr_finish = new int[rows][columns];
        int m = 0;
        for (int j=0; j< rows*columns; j++){

            if(j%columns==0){
                arr_in_arr = Arrays.copyOfRange(arr, first, second);
                if (second!=arr[arr.length-1]) {
                    arr_finish[m] = arr_in_arr;
                    m = m+1;
                    first = second;
                    second += columns;
                } else {
                    arr_finish[arr_finish.length-1]= arr_in_arr;
                    break;
                }
//                if (second-columns==arr[arr.length-1]){
//                    break;
//                }
            }
        }
//        for (int n = 0; n<rows; n++){
//            System.out.println(Arrays.toString(arr_finish[n]));
//        }
//
        int[] arr_in_last;
        int[][] arr_last = new int[rows][columns];
        int num_in_last = 0;

        for (int mm =arr_finish.length-1; mm>=0; mm--){
            arr_last[num_in_last] = arr_finish[mm];
            num_in_last = num_in_last+1;
        }

        int[][] arr_last1 = new int[rows][columns];
        int mk=0;

        int mg=0;

        for (int numbers = 0; numbers<columns; numbers++){
            arr_in_last = new int[columns];
            for (int num_rows=0; num_rows<rows; num_rows++){
                arr_in_last[mk] = arr_last[num_rows][numbers];
                mk++;
            }
            arr_last1[mg] = arr_in_last;

            mk=0;
            mg++;
        }

        String final_str[];
        final_str = new String[rows];

        for (int n = 0; n<rows; n++){
            String temp = Arrays.toString(arr_last1[n]);
            final_str[n] = temp;
//            System.out.println(Arrays.toString(arr_last1[n]));
        }


        System.out.println(Arrays.toString(final_str));
    }

}