package casting;

public class Casting3 {

    public static void main(String[] args) {
        long maxIntValue = 2147483647; //int 최고 값
        long maxIntOver = 2147483648L; //int 최고 값 + 1(초과)
        int intValue = 0;

        intValue = (int) maxIntValue; // 형변환

        System.out.println("maxIntValue casting = " + intValue);

        intValue = (int) maxIntOver;    // 오버플로우가 발생함 => 타입을 Long타입으로 변환
        System.out.println("maxIntOver casting = " + intValue);

    }
}
