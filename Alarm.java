package Baekjoon;
import java.util.Scanner;
public class Alarm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int h = input.nextInt();
        int m = input.nextInt();
        int m2 = m - 45;
        if (m2 < 0){
            m = (m - 45) + 60;
            if (h == 0){
                h+=24;
            }
            h--;
        }
        else {
            m = m - 45;
        }
        System.out.println(h + " " + m);
        input.close();
    }
}
