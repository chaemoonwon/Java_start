package array1.ex;

public class ArrayEx1 {
    public static void main(String[] args) {
        //배열 선언
        int[] students = {90, 80, 70, 60, 50};

//        int student1 = 90;
//        int student2 = 80;
//        int student3 = 70;
//        int student4 = 60;
//        int student5 = 50;

//        int total = student1 + student2 + student3 + student4 + student5;
        int total = 0;
        //점수 총합 => 누적합 구하기
        for (int student : students) {
            total += student;
        }
        double avg = (double) total / students.length;

        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + avg);
    }
}
