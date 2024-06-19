public class LinearSearch_01 {
    public static void main(String[] args) {
        int [] array  = {6,2,11,56,369,22,69,6};
        int key = 36339;
      boolean finded =  LinearSearch(array,key);
        System.out.println(finded);


    }
    public static boolean LinearSearch(int [] array,int key){
        if(array.length==0){ // in this case the element does not exist in the array
            return false;
        }
        for (int i = 0; i <array.length ; i+=1) {
            if(array[i]==key){
                return true;
            }
        }
        return false;

        }

}
