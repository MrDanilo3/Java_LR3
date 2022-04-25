package Zad4_2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Var6 {
    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] argc) {
        int N = scan.nextInt();
        solve(N, fill(10));


    }

    public static int[][] fill(int N) {
        int[][] arr = new int[N][N];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = (int) (Math.random() * 10);
            }
        }
        System.out.println(Arrays.deepToString(arr));
        return arr;



    }


    public static void solve(int N, int[][] arr) {
        for (int i = 0; i < arr[N].length; i++) {
            System.out.print(arr[N][i] + " ");
            if (  arr[N].length >  10) {
                throw new ArrayIndexOutOfBoundsException("Строка введена неверно");
            }
        }



    }


}
