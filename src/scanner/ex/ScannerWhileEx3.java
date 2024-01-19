package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요: ");

        int sum = 0;
//        double avg = 0;
        int count = 0;
        int number = 0;
//        while (true) {
//            number = scanner.nextInt();
//            if (number == -1) {
////                System.out.println("입력한 숫자들의 합계: " + sum);
////                System.out.println("입력한 숫자들의 평균: " + avg);
//                break;
//            }
//            count++;
//            sum = sum + number;
//            count++;
//            avg = (double) sum /count;
//        }

        while ((number = scanner.nextInt()) != -1) {
            sum = sum + number;
            count++;
        }


        double avg = (double) sum / count;
        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + avg);
    }
}
