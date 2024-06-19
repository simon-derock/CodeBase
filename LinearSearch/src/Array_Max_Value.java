public class Array_Max_Value {

    public static void main(String[] args) {
        int [] array = {55,3,11,44444,7,434,2,11,22};
        System.out.println(maxx(array,3,6));


    }
    private final static int maxx(int [] array,int start ,int end){
        int max = array[start];
        for (int i = start; i <end ; i++) {
            if(array[i]> max){
                max = array[i];
            }

        }
        return  max;


    }
}