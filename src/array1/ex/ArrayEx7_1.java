package array1.ex;

import java.util.Scanner;

public class ArrayEx7_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[][] students = new int[4][3];
        int math;
        int eng;
        int kor;
        int total = 0;

        for (int i = 0; i < 4; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");
            System.out.print("국어 점수: ");
            kor = sc.nextInt();
            System.out.print("영어 점수: ");
            eng = sc.nextInt();
            System.out.print("수학 점수: ");
            math = sc.nextInt();
            total = kor + eng + math;
        }

        double avg = (double) total / 3;
        for (int i = 0; i <4; i++) {
            System.out.println((i + 1) + "번 학생의 총점: " + total + ", 평균: " + avg);

        }

//        students[0][0] = 100;
//        students[0][1] = 80;
//        students[0][2] = 70;
//
//        students[1][0] = 30;
//        students[1][1] = 40;
//        students[1][2] = 50;
//
//        students[2][0] = 60;
//        students[2][1] = 70;
//        students[2][2] = 50;
//
//        students[3][0] = 90;
//        students[3][1] = 100;
//        students[3][2] = 80;


//        for (int i = 0; i < students.length; i++) {
//            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");
//            System.out.print("국어 점수: ");
//            kor = sc.nextInt();
//            System.out.print("영어 점수: ");
//            eng = sc.nextInt();
//            System.out.print("수학 점수: ");
//            math = sc.nextInt();
//            for (int j = 0; j < students[i].length; j++) {
//                System.out.println(students[i].length);
//                total = kor + eng + math;
//            }
//        }

//        double avg = (double) total / 3;
//        for (int i = 0; i < students.length; i++) {
//            System.out.println((i + 1) + "번 학생의 총점: " + total + ", 평균: " + avg);
//        }

    }
}
