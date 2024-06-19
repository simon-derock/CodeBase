import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int [] array = { 3,-55,1,2,-5555,7};
        System.out.println(findMin(array));
//        System.out.println(Arrays.toString(swap(array)));


    }
    static int findMin(int [] array){
        int m = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i]<m){
                m = array[i];
            }

        }

        return m;

    }
//    private final static int [] swap(int [] arr){
//        int temp =0;
//        for (int i = 0; i < arr.length ; i++) {
//            for (int j = 1; j < arr.length ; j++) {
//                if(arr[i]< arr[j]){
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//
//            }
//
//        }
//        return arr;

        }

//}
