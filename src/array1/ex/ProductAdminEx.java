package array1.ex;

import java.util.Scanner;

public class ProductAdminEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int productCount = 0;       //상품의 개수 저장 변수
        int maxCount = 10;
        String[] productNames = new String[maxCount];  //상품 이름 저장 배열
        int[] productPrices = new int[maxCount];    //상품 가격 저장 배열
        while (true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요:");
            int menu = sc.nextInt();

            if (menu == 1) {
                if (productCount >= maxCount) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    continue;
                }
                System.out.print("상품 이름을 입력하세요:");
                productNames[productCount] = sc.next();
                System.out.print("상품 가격을 입력하세요:");
                productPrices[productCount] = sc.nextInt();
                productCount++;
            } else if (menu == 2) {
                for (int i = 0; i < productCount; i++) {
                    System.out.println(productNames[i] + ": " + productPrices[i]);
                }
                if (productCount == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                }
            } else if (menu == 3) {
                System.out.println("프로그램을 종료합니다");
                return;
            }
//            switch (menu) {
//                case 1:
//                    if (productCount >= maxCount) {
//                        System.out.println("더 이상 상품을 등록할 수 없습니다");
//                    }
//                case 2:
////                    System.out.println("등록된 상품이 없습니다.");
//                    break;
//                case 3:
//                    return;
//            }
        }
    }
}
