package Baekjoon;
import java.util.Scanner;
public class SugarDelivery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean end = false;
        int n;
        int five = 0;
        int three = 0;
        int count = 0;
        int memory = 0;

        n = input.nextInt();

        while (!end){

            if (five < n) {
                five += 5;
                count++;

            }
            else {
                end=true;
            }
        }
        end = false;
        three = five;
        while (!end){
            if (three < n){
                three += 3;
                count++;
            }
            else {
                end = true;
            }
        }
        if (n <= 4){
            System.out.println("-1");
        }
        System.out.println(count);
    }
}
