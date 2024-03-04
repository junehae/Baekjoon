package Baekjoon;
import java.util.Scanner;
public class Dice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int d1 = input.nextInt();
        int d2 = input.nextInt();
        int d3 = input.nextInt();
        int s = 0;
        int reward = 0;

        if (d1 == d2 && d2 == d3 && d1 == d3){
            reward = 10000 + d1 * 1000;
        } else if (d1 == d2) {
            reward = 1000 + d1 * 100;
        } else if (d2 == d3) {
            reward = 1000 + d2 * 100;
        } else if (d1 ==d3) {
            reward = 1000 + d1 * 100;
        }
        else{
            if (d1 > d2 && d1 > d3){
                reward = d1 *100;
            } else if (d2 > d1 && d2 > d3) {
                reward = d2 *100;
            } else if (d3 > d1 && d3 > d2) {
                reward = d3 *100;
            }

        }
        System.out.println(reward);

    }
}
