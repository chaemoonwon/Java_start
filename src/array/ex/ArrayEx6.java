package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int count = sc.nextInt();

        System.out.println(count + "개의 정수를 입력하세요:");
        int[] number = new int[count];

        int min;
        int max;
        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
        }
        min = max = number[0];
        for (int i = 1; i < number.length; i++) {
            if(number[i] > max) {
                max = number[i];
            }
            if(number[i] < min) {
                min = number[i];
            }
        }


        System.out.println("가장 작은 정수: " +min);
        System.out.print("가장 큰 정수: " + max);

    }

}
