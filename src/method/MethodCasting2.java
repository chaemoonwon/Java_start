package method;

public class MethodCasting2 {

    public static void main(String[] args) {
        int number = 100;
        printNumber(number); //int형 인수를 double형 매개변수에 전달하는 것은 문제가 없음
    }

    public static void printNumber(double n) {
        System.out.println("숫자 = " + n);
    }
}
