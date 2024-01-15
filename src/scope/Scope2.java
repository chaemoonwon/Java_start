package scope;

public class Scope2 {

    public static void main(String[] args) {
        int m = 10;
        for (int i = 0; i < 2; i++) {
            System.out.println("for m = " + m); // 블록 내부에서 접근 가능하다.
            System.out.println("for i = " + i);
        }   // i 생존 종료
//        System.out.println("i = " + i);
        System.out.println("Scope2.main" + m);
    }
}
