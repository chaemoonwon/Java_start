package array.ex;

public class ArrayEx11 {
    public static void main(String[] args) {
        int[] array = new int[5];
        int n = 4;
        int count = 0;

        array[0] = 1;
        array[1] = 2;
        array[2] = 2;
        array[3] = 3;
        array[4] = 2;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                count++;
            }
        }
        System.out.println(count);
    }
}
