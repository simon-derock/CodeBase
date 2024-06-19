//import java.util.ArrayList;
//import java.util.Collections;
//
//public class Remove_Element {
//    public static void main(String[] args) {
//        int [] nums = {0,1,2,2,3,0,4,2};
//        int target = 2;
//        System.out.println(removeElement(nums,target));
//    }
//    public static int removeElement(int[] nums, int val)  {
//        ArrayList<Integer> mylist = new ArrayList<>();
//        ArrayList<Integer> value = new ArrayList<>();
//        value.add(val);
//        ArrayList<Integer> otherlist = new ArrayList<>();
//        for(int i : nums){
//            mylist.add(nums[i]);
//        }
//        int m = mylist.toArray().length;
//        for (int i = 0; i <mylist.size(); i++) {
//        if(mylist!=value){
//                otherlist.add(mylist);
//
//            }
//        }
//        System.out.println(otherlist);
//        return otherlist.size();
//    }
//
//}
