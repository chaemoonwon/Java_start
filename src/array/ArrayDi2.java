package array;

public class ArrayDi2 {

    public static void main(String[] args) {
        // 2x3 2차원 배열을 만든다.

        int[][] arr = new int[2][3];    //행2, 열3

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;


        for (int i = 0; i < 2; i++) {       //행을 탐색
            for (int j = 0; j < 3; j++) {      //열을 탐색
                System.out.print(" " + arr[i][j]);
            }
            System.out.println(); //한 행이 끝나면 라인 변경
        }
    }
}
