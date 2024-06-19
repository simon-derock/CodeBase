public class Search_in_Range {

    public static void main(String[] args) {
        int [] array = {55,10,22,4,107,55,66,23,1};
        // Question: search in the range of 1 to 4.

        int search_item = 22;
        System.out.println(SearchInRange(array,search_item,1,4));

    }

    private final static int SearchInRange(int [] array , int search_item,int start , int end){
       int result = -1;
       result =  (array.length)==0?-1:-1;
        for (int i = start; i <end ; i++) {
            if(search_item==array[i]){
               result = i;
            }
        }
        return result;
    }
}
