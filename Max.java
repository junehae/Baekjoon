package Baekjoon;
import java.util.Scanner;
public class Max {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num[] = new int[9];
        int max = 0;
        int count = 0;

        for (int i=0; i<9; i++){
            num[i] = input.nextInt();
        }

        for (int i=0; i<9; i++){
            if (num[i] > max) {
                max = num[i];
                count = i+1;
            }
        }
        System.out.println(max);
        System.out.println(count);
    }
}
