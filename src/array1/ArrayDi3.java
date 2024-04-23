package array1;

public class ArrayDi3 {
    public static void main(String[] args) {
        //2 x 3 2차원 배열을 만듬
//        int[][] arr = new int[2][3];    //행2, 열3

        //2차원 배열 리팩토링
        //2차월 배열의 선언과 생성 및 초기화를 동시에 함. 1차원 배열과 동일한 원리로 나타내 줄 수 있음.
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6}
        };    //행2, 열3


//        arr[0][0] = 1;  //0행 0열
//        arr[0][1] = 2;  //0행 1열
//        arr[0][2] = 3;  //0행 2열

//        arr[1][0] = 4;  //1행 0열
//        arr[1][1] = 5;  //1행 1열
//        arr[1][2] = 6;  //1행 2열

        //2차원 배열 리팩토링
        //row을 변수로 선언해서 출력 => 행 출력 반복
        for (int row = 0; row < arr.length; row++) {
            //column을 변수로 선언해서 출력 => 열 출력 반복
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
//            System.out.print(arr[row][0] + " ");
//            System.out.print(arr[row][1] + " ");
//            System.out.print(arr[row][2] + " ");
            System.out.println();
        }
    }
}
