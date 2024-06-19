public class BinarySearch {
    public static int myBinarySearch(int [] array , int element){
        int start = 0;
        int end = array.length -1;

        if(array.length == 0){
            return  -1;
        }
        boolean Ascending_ord = array[start] < array[end];

        while(start <= end){
            int middle = (start + end) / 2;

            if(element == array[middle]){
                return middle;
            }
//            ///
            if(Ascending_ord){
                if (element > array[middle]) {
                    start = middle +1;

                }
                else  {
                    end = middle -1;

                }

            }
            else {
                if(element > array[middle]){
                    end = middle -1;
                }
                else {
                    start = middle +1;
                }

            }



        }
        return  -1;




    }

}