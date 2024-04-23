package programmers.test.array;

import java.util.Arrays;

public class ArraySplit {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5};
        int num1 = 1;
        int num2 = 2;
        int k = 0;

//        System.out.println(numbers[num1]);
//        System.out.println(numbers[num2]);

        int[] answer = new int[num2-num1+1];

        for (int i = num1; i <= num2; i++) {

            answer[k] = numbers[i];
            System.out.println(answer[i]);
        }
    }
}
