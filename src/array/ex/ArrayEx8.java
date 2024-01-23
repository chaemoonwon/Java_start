package array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("학생수를 입력하세요:");
        int count = sc.nextInt();
        int[][] score = new int[count][3];
        String[] subjects = {"국어", "영어", "수학"};

        //입력
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");
            for (int j = 0; j < 3; j++) {
                System.out.print(subjects[j] + " 점수:");
                score[i][j] = sc.nextInt();
            }
        }
        //출력
        for (int i = 0; i < count; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += score[i][j];
            }
            double avg = total / 3.0;
            System.out.println((i + 1) + "번 학생의 총점: " + total + ", 평균: " + avg);
        }
    }
}
