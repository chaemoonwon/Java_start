package programmers.test.array;

public class ArrayCenterV2 {
    class Solution {
        public int solution(int[] array) {
            int answer = 0;

            for (int i = 0; i < array.length -1; i++) {

                int sort;
                if (array[i] >= array[i+1]) {
                    sort = array[i];
                    array[i] = array[i+1];
                    array[i+1] = sort;
                }
            }

            int length = array.length;

            if (array.length % 2 == 0) {
                length = array.length - 1;
            }
            answer = length / 2;

            return array[answer];
        }
    }
}
