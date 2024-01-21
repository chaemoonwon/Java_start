package array.ex;

import java.util.Scanner;

public class ArrayEx5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int size = sc.nextInt();
        int[] number = new int[size];

        int total = 0;
        System.out.println(number.length +"개의 정수를 입력하세요:");
        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
            total += number[i];
        }
        
        double avg = (double) total / number.length;

        System.out.println("입력한 정수의 합계: " + total);
        System.out.println("입력한 정수의 평균: " + avg);
    }
}
