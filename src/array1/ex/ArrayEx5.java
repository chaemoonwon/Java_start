package array1.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        int total = 0;
        System.out.println(size + "개의 정수를 입력하세요:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
            total += arr[i];
        }
//        for (int i = 0; i < arr.length; i++) {
//        }
        double avg = (double) total / size;

        System.out.print("입력한 정수의 합계: " + total);
        System.out.println();
        System.out.print("입력한 정수의 평균: " + avg);

    }
}
