package Baekjoon;
import java.util.Scanner;
public class Counting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int n = input.nextInt();
        int[] num = new int[n];
        for (int i=0; i<n; i++){
            num[i] = input.nextInt();
        }
        int v = input.nextInt();
        for (int i=0; i<n; i++){
            if (num[i]==v){
                count++;
            }
        }
        System.out.println(count);
    }
}
