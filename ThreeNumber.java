package Baekjoon;
import java.util.Scanner;
public class ThreeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        int j = input.nextInt();
        int k = input.nextInt();

        if (i+j==k){
            System.out.printf("%d+%d=%d",i,j,k);
        } else if (i-j==k) {
            System.out.printf("%d-%d=%d",i,j,k);
        } else if (i*j==k) {
            System.out.printf("%d*%d=%d",i,j,k);
        } else if (i/j==k) {
            System.out.printf("%d/%d=%d",i,j,k);
        } else if (i==j+k) {
            System.out.printf("%d=%d+%d",i,j,k);
        } else if (i==j-k) {
            System.out.printf("%d=%d-%d",i,j,k);
        } else if (i==j*k) {
            System.out.printf("%d=%d*%d",i,j,k);
        } else if (i==j/k) {
            System.out.printf("%d=%d/%d",i,j,k);
        }
    }
}
