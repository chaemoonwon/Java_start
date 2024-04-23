package array.ex;

public class ArrayEx10 {
    public static int[] main(String[] args) {
        String[] strlist = new String[4];
        strlist[0] = "We";
        strlist[1] = "are";
        strlist[2] = "the";
        strlist[3] = "world!";


        int[] number = new int[4];
        for (int i = 0; i < strlist.length; i++) {
            number[i] = strlist[i].length();
            System.out.println(number[i]);
        }
        return number;




//        for (int i : number) {
//            System.out.println("i = " + i);
//        }
    }
}
