package Baekjoon;
import java.util.Scanner;
public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int min, max;
        int num[] = new int[n];
        for (int i=0; i<n; i++){
            num[i] = input.nextInt();
        }
        min = num[0];
        max = num[0];
        for (int i=0; i<n; i++){
            if (min > num[i]) {
                min = num[i];
            } else if (max < num[i]) {
                max = num[i];
            }
        }
        System.out.println(min + " " + max);
    }
}
