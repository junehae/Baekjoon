package Baekjoon;

import java.util.Scanner;
public class Remain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int result = 0;
        int[] arr = new int[10];

        //입력
        for (int i=0; i<10; i++)
            arr[i] = input.nextInt();

        //모든 수를 42로 나누기
        for (int i=0; i<10; i++)
            arr[i] = arr[i] % 42;

        //같은 수가 있는지 찾기
        for (int i=0; i<10; i++) {
            int count = 0;
            for (int j = i + 1; j < 10; j++)
                if (arr[i] == arr[j]) //같은 수가 있는지 확인
                    count++;
            if (count == 0)
                result++; //같은 것이 없다면 다른 것이니 더해줌
        }
        //출력
        System.out.println(result);
    }
}
