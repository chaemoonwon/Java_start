package cond.ex;

import java.util.Scanner;

public class PizzaEx {
    public static void main(String[] args) {
        int n = 14;
        int count = 0;
        while (true) {
            if (n / 7 <= count) {
                System.out.println(count+1);
                break;
            } else  {
                count++;
            }
        }
    }

}
