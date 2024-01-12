package operator;

public class Operator1 {

    public static void main(String[] args) {
        //변수 초기화

        int a = 5;
        int b = 2;

        //덧셈
        int sum = a + b;
        System.out.println("sum = " + sum); // a + b

        //뺄셈
        int diff = a - b;
        System.out.println("diff = " + diff);   // a - b

        //곱셈
        int multi = a * b;
        System.out.println("multi = " + multi); // a * b

        //나눗셈(몫)
        int div = a / b;    // 2.5
        System.out.println("div = " + div); // a / b

        //나머지
        int mod = a % b;
        System.out.println("mod = " + mod); // a % b


        //예외가 발생
        //Exception in thread "main" java.lang.ArithmeticException: / by zero
        int z = 10 / 0;

    }
}
