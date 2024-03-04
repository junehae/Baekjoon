package Baekjoon;

import java.util.Scanner;
public class ChangeBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr;
        int i;
        int j;
        int k;

        int n = input.nextInt();
        int m = input.nextInt();

        n++;

        arr = new int[n];

        for (int f=0; f<n; f++){
            arr[f] = f;
        }

        for (int f=0; f<m; f++){

            i = input.nextInt();
            j = input.nextInt();

            k = arr[i];
            arr[i] = arr[j];
            arr[j] = k;

        }

        for (int f=1; f<arr.length; f++){
            System.out.print(arr[f] + " ");
        }

    }
}
