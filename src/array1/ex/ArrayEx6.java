package array1.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println(size + "개의 정수를 입력하세요:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < size; i++) {
            if (min > arr[i]) {
                min = arr[i];
            } else {
                max = arr[i];
            }
        }

        System.out.println("가장 작은 정수: " + min);
        System.out.print("가장 큰 정수: " + max);
    }
}
