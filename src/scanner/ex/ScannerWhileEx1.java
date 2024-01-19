package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료): ");
//            String name = scanner.nextLine(); //아무런 값이 없으므로 " "문자열로 출력됨.
            String name = scanner.next();

            if(name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("나이을 입력하세요: ");
            int age = scanner.nextInt();    // 10\n로 입력
//            scanner.nextLine();           // ""문자열을 대체하는 입력 문자열 출력

            System.out.println("입력한 이름: " +name +", 나이: " + age);
        }
    }

}
