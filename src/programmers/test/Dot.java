package programmers.test;

public class Dot {
    public static void main(String[] args) {
        int[] dot = new int[2];
        dot[0] = -7;
        dot[1] = 9;
        int[] k = {1,2,3,4};
        int answer = 0;

        if (dot[0] > 0 && dot[1] > 0) {
            answer = k[0];
        } else if (dot[0] < 0 && dot[1] > 0) {
            answer = k[1];
        } else if (dot[0] > 0 && dot[1] < 0) {
            answer = k[2];
        } else if (dot[0] < 0 && dot[1] < 0){
            answer = k[3];
        }
        System.out.println(answer);
    }
}
