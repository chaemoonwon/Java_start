package method;

public class Method1 {
    public static void main(String[] args) {
        //계산1
        int a = 1;
        int b = 2;
        System.out.println(a + "+" + b + " 연산을 수행");
        int sum1 = a + b;
        System.out.println("sum1 = " + sum1);

        //계산2
        int x = 10;
        int y = 20;

        System.out.println(x + "+" + y + " 연산을 수행");
        int sum2 = x + y;
        System.out.println("sum2 = " + sum2);

        // 같은 코드를 여러번 반복해야 하는 문제가 생김
        // 해당 코드를 수정하기 위해서는 각각의 코드를 찾아서 수정해야 함.
    }
}
