package method.ex;

import java.util.Scanner;

public class MethodEx4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "1.입금 | 2.출금 | 3.잔액 확인 | 4.종료";
        int balance = 0;

        while (true) {
            System.out.println("----------------------------------");
            System.out.println(str);
            System.out.println("----------------------------------");
            System.out.print("선택: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("입금액을 입력하세요: ");
                    int deposit = sc.nextInt();
                    balance = deposit(balance, deposit);
                    break;
                case 2:
                    System.out.print("출금액을 입력하세요: ");
                    int withdraw = sc.nextInt();
                    balance = withdraw(balance, withdraw);
                    break;
                case 3:
                    System.out.println("현재 잔액: " + balance);
                    break;
                case 4:
                    System.out.println("시스템을 종료합니다.");
                    return;
                default:
                    System.out.println("올바른 선택이 아닙니다.");
            }
        }
    }

    public static int deposit(int balance, int depositAmount) {
        balance += depositAmount;
        System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액: " + balance);
        return balance;
    }
    public static int withdraw(int balance, int withdrawAmount) {
        if (balance >= withdrawAmount) {
            balance -= withdrawAmount;
            System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }

}
