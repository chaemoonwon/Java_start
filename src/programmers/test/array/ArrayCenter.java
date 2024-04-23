package programmers.test.array;

import java.util.Arrays;

public class ArrayCenter {
    public static void main(String[] args) {
        int answer = 0;
        int[] array = {4, -6, 10};
//        int[] array = {9,-1,0};

        //내림차순 정렬

        // 9 , -1
        // 9 -> sort
        // -1 -> 9
        // 9 -> -1

//        for (int i = 0; i < array.length - 1; i++) {
//
//            int sort;
//            if (array[i] >= array[i + 1]) {
//                sort = array[i];
//                array[i] = array[i + 1];
//                array[i + 1] = sort;
//            }
//        }

        Arrays.sort(array);

        answer = array[array.length/2];



//        System.out.println(Arrays.toString(Arrays.stream(array).toArray()));

//        int length = array.length;
//
//        if (array.length % 2 == 0) {
//            length = array.length - 1;
//        }
//        answer = length / 2;


        // 중앙값 정렬
//        if (array.length % 2 == 1) {
//
//        } else {
//            answer = array.length /2;
//        }

        System.out.println(answer);
    }

//    class Solution {
//        public int solution(int[] array) {
////            int answer = 0;
////
////            array = new int[] {1,2,7,10,11};
////
////            array = Arrays.stream(array).sorted().toArray();
////
////            if (array.length % 2 == 1) {
////                answer = (array.length + 1) /2;
////            } else {
////                answer = array.length /2;
////            }
////
////            return array[answer];
////        }
//
//    }
}
