package method.ex;

public class MethodEx2 {
    public static void main(String[] args) {
        String message = "Hello world!";
//        for (int i = 0; i < 3; i++) {
//            System.out.println(message);
//        }
//        for (int i = 0; i < 5; i++) {
//            System.out.println(message);
//        }
//        for (int i = 0; i < 7; i++) {
//            System.out.println(message);
//        }
        message(message, 3);
        message(message, 5);
        message(message, 7);
    }
    
    public static void message(String message, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(message);
        }
    }
}
