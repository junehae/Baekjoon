package Baekjoon;
import java.util.Scanner;
public class Compare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        if (n > m){
            System.out.println(">");
        }
        else if (n < m) {
            System.out.println("<");
        }
        else {
            System.out.println("==");
        }
    }
}