package programmers.test;

public class Reverse {
    public static void main(String[] args) {
        String my_string = "jaron";
        String answer = "";
        for (int i = my_string.length() - 1; i >= 0; i--) {
            answer = answer + my_string.charAt(i);
        }
        System.out.println(answer);
    }
}
