package method;

public class Method1Ref {
    public static void main(String[] args) {
        //계산1
        int sum1 = add(5,10);
        System.out.println("sum1 = " + sum1);

        //계산2
        int sum2 = add(15,20);
        System.out.println("sum2 = " + sum2);

        // 같은 코드를 여러번 반복해야 하는 문제가 생김
        // 해당 코드를 수정하기 위해서는 각각의 코드를 찾아서 수정해야 함.


        // 메소드 호출
        add(100,200);
    }

    public static int add(int a, int b) {
        System.out.println(a + "+" + b + " 연산을 수행");
        int sum = a + b;
        return sum;
    }
}
