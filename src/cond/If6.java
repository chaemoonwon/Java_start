package cond;

public class If6 {

    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        // 조건을 만족하면 루프를 빠져나옴
        if(10000<= price) {
            discount = discount + 1000;
            System.out.println("10000원 이상 구매시 1000원 할인");
        } else if (age <= 10) {
            discount = discount + 1000;
            System.out.println("어린이 할인 적용");
        } else {
            System.out.println("할인 없음");
        }

        System.out.println("총 할인 금액 = " + discount);

    }
}
