public class r {
    public static void main(String[] args) {
        int [] array = {44,22,1,444,2,-66,77};
        System.out.println(minn(array));
    }
    static int minn(int [] array){
        int min = array[0];
        for (int i = 0; i <array.length ; i++) {
            if(array[i] < min){
                min = array[i];
            }


        }
        return  min;
    }
}
