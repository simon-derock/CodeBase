import java.util.Arrays;
import java.util.Scanner;

public class Multi_Dimensional_Array {
    public static void main(String[] args) {
//    int [][] array = {
//            {1,2},      // row 0
//            {3,4,5,6}, // row  1
//            {7,8} ,
//            {9,10}// row 2
//    };
//        System.out.println(Arrays.toString());

//        System.out.println(  "length of the array : " + array.length + "\n") ;
//        for (int row = 0; row <array.length ; row++) {
////            System.out.println('[');
//            for (int column = 0; column < array[row].length; column++) {
//                System.out.print(" " + array[row][column] + " ");
//
//            }
//            System.out.println(" ");
//
//        }

        int [][] array = new int[5][5];
//
        Scanner input = new Scanner(System.in);
//
        System.out.println("Enter the values to store ");
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                array[row][column] = input.nextInt();

            }

        }



        for(int [] k :array){
            System.out.println(Arrays.toString(k));

        }



    }
}
