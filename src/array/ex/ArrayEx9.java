package array.ex;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayEx9 {
    public static void main(String[] args) {


        int[] array = new int[4];

        int height = 167;

        array[0] = 149;
        array[1] = 180;
        array[2] = 192;
        array[3] = 170;

        int count = 0;
        for (int i : array) {
            if (height < i) {
                count++;
            }
        }
        System.out.println(count);


    }
}
