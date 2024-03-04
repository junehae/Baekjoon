package Baekjoon;
import java.util.Scanner;
public class CodingIsAthlethicSubject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int by;
        int count = 0;

        by = input.nextInt();

        for (int i=by; i>0; i-=4){
            count++;
        }

        for (int i=0; i<count; i++){
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
