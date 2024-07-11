public class kadaneAlgo {
    public static void main(String[] args) {
        int [] array = { -2,1,-3,4,-1,2,1,-5,4};
        int max = max_of_array(array);
        int sum = 0;
        /////
        for (int i = 0; i <array.length ; i++) {
            if(array[i] + sum < 0){
                sum = 0;
            }
            else {
                sum += array[i];
               max = max_of_two(sum , max);
            }
        }
        System.out.println(max);
    }
    public static int max_of_array(int [] array) {
        int m = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > m ){
                m = array[i];
            }
        }
        return m;
    }
    public static int max_of_two(int x , int y) {
        if(x>y){
            return x;
        }
        else{
            return y;
        }
    }

}
