package array1;

public class ArrayDi1 {
    public static void main(String[] args) {
        //2 x 3 2차원 배열을 만듬
        int[][] arr = new int[2][3];    //행2, 열3

        arr[0][0] = 1;  //0행 0열
        arr[0][1] = 2;  //0행 1열
        arr[0][2] = 3;  //0행 2열
        arr[1][0] = 4;  //1행 0열
        arr[1][1] = 5;  //1행 1열
        arr[1][2] = 6;  //1행 2열

        //2차원 배열 리팩토링
        //row을 변수로 선언해서 출력 => 행 출력 반복
        for (int row = 0; row < 2; row++) {
            //column을 변수로 선언해서 출력 => 열 출력 반복
            for (int column = 0; column < 3; column++) {
                System.out.print(arr[row][column] + " ");
            }
//            System.out.print(arr[row][0] + " ");
//            System.out.print(arr[row][1] + " ");
//            System.out.print(arr[row][2] + " ");
            System.out.println();
        }

        //이중 for문으로 반복 출력함으로써 코드를 간결하게 해주었음.
    }
}
