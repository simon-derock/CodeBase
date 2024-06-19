import java.util.Arrays;
public class First_and_Last_in_Array {
    public static void main(String[] args) {
        int [] array = { 5 ,7 ,7 ,8 ,8, 10};
        int target = 8;
        int [] result = new int[2];
        result[0] = findFirst(array , target);
        result[1] = findLast(array ,target);

        System.out.println(Arrays.toString(result));
    }
    static int findFirst(int [] array, int target){

        int start = 0;
        int end = array.length -1 ;
        int indexing = -1;

        while(start <= end){
            int middle = start + (end - start) / 2 ;

            if(array[middle]  >= target) {
                end = middle - 1;
            }
            else {
                start = middle + 1 ;
            }
            if(array[middle] == target){
                indexing =  middle;
            }
        }
        return  indexing;
    }
    static int findLast(int [] array , int target){
        int start = 0;
        int end = array.length -1 ;

        int indexing = -1 ;

        while(start <= end){
            int middle = start + (end - start) / 2 ;

            if(array[middle] <= target ){

                start = middle + 1 ;
            }
            else {
                end = middle - 1 ;
            }
            if(array[middle] == target){
                indexing = middle;
            }
        }
        return  indexing;

    }

}