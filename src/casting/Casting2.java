package casting;

public class Casting2 {


    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

//        intValue = doubleValue; //컴파일 오류 발생

        intValue = (int) doubleValue;   //형변환
        System.out.println(intValue);   //명시적으로 형변환 할 경우 손실 변환이 발생함

    }

}
