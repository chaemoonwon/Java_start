package programmers.test.array;

import java.util.Arrays;

public class ArrayTwice {
    public static void main(String[] args) {
        int[] answer = {1,2,3,4,5};

//        int twiceAnswer1 = 2 * answer[0];
//        int twiceAnswer2 = 2 * answer[1];
//        int twiceAnswer3 = 2 * answer[2];
//        int twiceAnswer4 = 2 * answer[3];
//        int twiceAnswer5 = 2 * answer[4];

        System.out.println(Arrays.toString(soulution(Arrays.stream(answer).toArray())));

    }


    public static int[] soulution(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 2 * numbers[i];
        }

        return numbers;
    }
}
