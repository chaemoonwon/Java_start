package variable;

public class Var6 {

    public static void main(String[] args) {
        int a;
//        System.out.println("a = " + a);
        // 오류 발생 java: variable a might not have been initialized
        // 오류 발생 이유 : 변수를 선언하면 메모리상의 어떤 공간을 차지하고 사용한다.
        // 그런데 그 공간에 기존에 어떤 값이 있었는지는 아무도 모른다. 따라서 초기화를 하지 않으면 이상한 값이 출력될 수 있다.
        // 해결 : 변수는 초기화 해야 함

        /*
        * 위와 같은 변수는 지역 변수(Local Variable)라고 하는데, 지역 변수는 개발자가 직접 초기화를 해주어야 한다.
        *.나중에 배울 클래스 변수와 인스턴스 변수는 자바가 자동으로 초기화를 진행해준다.
        * */

    }

}
