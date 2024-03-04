package Baekjoon;
import java.util.Scanner;
public class GwajeAnneSinBun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[30];
        int[] arr2 = new int[30];

        for (int i=0; i<28; i++){
            arr[i] = input.nextInt();
        }

        for (int i=0; i<30; i++){
            for (int j=0; j<30; j++){
                if (arr[j] == i+1){
                    arr2[i] = i+1;
                }
            }
        }


        for (int i=0; i<30; i++){
            if (arr2[i] == 0){
                System.out.println(i+1);
            }
        }

    }
}
