package array1;

public class Array1Ref3 {
    public static void main(String[] args) {
//        int[] students; //배열 변수 선언
//        students = new int[5];  //배열 생성

        //배열 리팩토링V1
        //배열 생성과 초기화 => 변수 값 대입
//        students = new int[] {90, 80, 70, 60, 50};

        //배열 리패토링V2
        //배열의 변수 선언과 생성 초기화를 동시에 함.
        // => 배열 변수를 선언함과 동시에 생성과 초기화를 해주어야 함.
        //라인을 나누어서 선언 후에 초기화를 할 수는 없음.
        int[] students = {90, 80, 70, 60, 50};


        //변수 값 대입
//        students[0] = 90;
//        students[1] = 80;
//        students[2] = 70;
//        students[3] = 60;
//        students[4] = 50;

        System.out.println(students.length);

        //배열 리팩토링
        //반복문과 배열을 같이 사용 => 변수 값 사용
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수 : " + students[i]);
        }

        //변수 값 사용
//        System.out.println("학생1 점수 : " + students[0]);
//        System.out.println("학생2 점수 : " + students[1]);
//        System.out.println("학생3 점수 : " + students[2]);
//        System.out.println("학생4 점수 : " + students[3]);
//        System.out.println("학생5 점수 : " + students[4]);

        //배열로 문제를 해결하였음.
    }
}
