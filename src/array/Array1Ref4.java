package array;

public class Array1Ref4 {

    public static void main(String[] args) {
        // 배열을 사용할 경우
        // 학생의 점수를 추가해도 {90, 80, 70, 60, 50} 의 내용만 변경하면 된다.
        // 그러면 나머지 코드는 변경하지 않아도 되는 장점이 있음.
        int[] students = {90, 80, 70, 60, 50, 40, 30, 20}; // 배열 변수 선언과 동시에 초기화 할 경우에만 사용 가능

        //변수 값 사용
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생: "+ (i + 1) +", 점수: " + students[i]);
        }
    }
}
