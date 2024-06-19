public class D {
    public static void main(String[] args) {
//        int [] arr =
        int [] array  = {9,6,4,2,3,5,7,0,1};
        System.out.println(missing(array));


    }


    static int  missing(int [] array){
        int mis = 0;
        int [] temparray = new int[array.length +1];
        for(int i=0; i<temparray.length;i++){
            temparray = new int[] {i};
        }
        for(int j =0;j<temparray.length;j++){
            if(array[j]!=temparray[j]){
                mis = j;
            }
        }
        return mis;
    }

}
