package array1.ex;

import java.util.Scanner;

public class ArrayEx7_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] students = new int[4][3];
        String[] subject = {"국어", "영어", "수학"};
        int[] stScore = new int[4];

        for (int i = 0; i < students.length; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");
        for (int j = 0; j < students[i].length; j++) {
            System.out.print(subject[j] + " 점수:");
            students[i][j] = sc.nextInt();
            stScore[i] += students[i][j];
        }
        System.out.println();
    }

        for (int i = 0; i < students.length; i++) {
            double avg = (double) stScore[i] / 3;
            System.out.println((i + 1) + "번 학생의 총점: " + stScore[i] + ", 평균: " + avg);
        }
    }
}
