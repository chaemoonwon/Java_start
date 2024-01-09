package variable;

public class Var7 {

    public static void main(String[] args) {
        int a = 100;    //정수
        double b = 10.5;    //실수
        boolean c = true;   //boolean : true, false (참과 거짓)
        char d = 'A';   // 문자 1개 (작은 따옴표 사용)
        String s = "Hello Java";    //문자열, 문자열을 다루기 위한 타입 (큰 따옴표 사용)


        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("s = " + s);


        /* 리터럴
        * 개발자가 직접 적은 100 , 10.5 , true , 'A' , "Hello Java" 와 같은 고정된 값
        * 변수의 값은 변할 수 있지만 리터럴은 개발자가 직접 입력한 고정된 값이다.
        * 따라서 리터럴 자체는 변하지 않는다
        * */
    }
}
