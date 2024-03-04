package Baekjoon;
import java.util.Scanner;
public class Receit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalPrice = input.nextInt();
        int types = input.nextInt();
        int price, many;
        int result = 0;

        for (int i=0; i<types; i++){
            price = input.nextInt();
            many = input.nextInt();

            result = result+ (many*price);
        }
        if (result == totalPrice){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        
    }
}
