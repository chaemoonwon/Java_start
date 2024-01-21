package array;

public class ArrayDi3 {

    public static void main(String[] args) {
        // 2x3 2차원 배열을 만든다.
        int[][] arr = {
                {1,2,3},
                {4,5,6}
        };    //행2, 열3

        for (int i = 0; i < arr.length; i++) {       //행을 탐색
            for (int j = 0; j < arr[i].length; j++) {      //열을 탐색
                System.out.print(" " + arr[i][j]);
            }
            System.out.println(); //한 행이 끝나면 라인 변경
        }
    }
}
