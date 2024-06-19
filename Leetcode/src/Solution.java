import java.util.Arrays;

public class Solution {


    public static void main(String[] args) {
        int [] nums = {0,1,2,2,3,0,4,2};
        int target = 2;
        System.out.println(removeElement(nums,target));
    }
    public static int removeElement(int[] nums, int val){
        int k =0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val){

                k++;
            }
        }
        return k;

    }

}