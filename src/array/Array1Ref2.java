package array;

public class Array1Ref2 {

    public static void main(String[] args) {
        int[] students; //배열 변수 선언
        students = new int[5];  //배열 생성

        //변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

//        int student1 = 90;
//        int student2 = 80;
//        int student3 = 70;
//        int student4 = 60;
//        int student5 = 50;

        //변수 값 사용
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생: "+ (i + 1) +", 점수: " + students[i]);
        }

//        System.out.println("student1 = " + students[0]);
//        System.out.println("student2 = " + students[1]);
//        System.out.println("student3 = " + students[2]);
//        System.out.println("student4 = " + students[3]);
//        System.out.println("student5 = " + students[4]);


    }
}
