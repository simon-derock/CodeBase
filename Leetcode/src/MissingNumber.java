import java.util.ArrayList;

public class MissingNumber {

    public static void main(String[] args) {
        int [] array  = {9,6,4,2,3,5,7,0,1};
//        System.out.println(Arrays.toString(array));
        System.out.println(findMissing(array));

    }


    public static int findMissing(int [] nums){
        ArrayList <Integer> list1 = new ArrayList ();
        ArrayList <Integer> list2 = new ArrayList ();
        for(int z : nums){
            list1.add(z);
        }
        for(int i=0;i<nums.length+1;i++){
            list2.add(i); }
        for(int j=0;j<list2.size();j++){
            if(!list2.contains(list1)){
                list2.removeAll(list1);
            }
        }
        return list2.get(0);
    }   

}
