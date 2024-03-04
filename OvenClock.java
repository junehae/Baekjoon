package Baekjoon;
import java.util.Scanner;
public class OvenClock {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int h = input.nextInt();
        int m = input.nextInt();
        int setTime = input.nextInt();
        int min = h * 60 + m;
        min = min + setTime;
        int hour = (min/60) % 24;
        int minute = min % 60;
        System.out.println(hour + " " + minute);


    }
}
