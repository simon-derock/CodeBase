public class Minimum_Number {
    public static void main(String[] args) {
        int[] array = { 131,3,56,77,-5,9,3,1,45,89,};
        System.out.println(minimum(array));

    }
    private final static int minimum(int [] array) throws ArrayIndexOutOfBoundsException{
        if(array.length==0){  return -1; }
        int min =array[0];
        for (int i = 0; i < array.length; i++) {

            if(array[i]<min){
                min=array[i];
//                return min;
            }
        }
        return min;


    }
}