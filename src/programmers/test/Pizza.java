package programmers.test;

public class Pizza {
    public static void main(String[] args) {
        int slice = 4;
        int n = 20;
        int result = 0;

        //최소 한 사람이 한 조각씩 먹는다
        if (slice >= n) {
            result = 1;
        } else {
            if (n % slice == 0) {
                result = n / slice;
            } else {
                result = n / slice +1;
            }
        }
        System.out.println(result);
    }
}
