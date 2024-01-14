package loop;

public class Continue1 {

    public static void main(String[] args) {
        int i = 1;

        while (i <= 5) {
           if(i == 3) {
               i++;
               continue;
           }
           // i ==3 일때 출력되지 않는 것을 확인
           System.out.println(i);
           i++;

        }
    }
}
