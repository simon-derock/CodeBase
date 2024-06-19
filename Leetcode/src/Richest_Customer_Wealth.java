/*
You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the customer has in the j bank. Return the wealth that the richest customer has.

A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

Input: accounts = [[1,5],[7,3],[3,5]]
Output: 10
Explanation:
1st customer has wealth = 6
2nd customer has wealth = 10
3rd customer has wealth = 8
The 2nd customer is the richest with a wealth of 10.
 */
public class Richest_Customer_Wealth {

    public static void main(String[] args) {
        int [][] array = { { 1,5},{7,3},{3,5}
        };
        System.out.println(maximumWealth(array));
//        ax();



    }
    public static int maximumWealth(int[][] accounts) {

        int maxWealth = Integer.MIN_VALUE;


        for (int i = 0; i <accounts.length; i++) {
            int wealth = 0;
            for (int j = 0; j <accounts[i].length ; j++) {
                wealth+=accounts[i][j] ;




            }
            if(wealth > maxWealth){
                maxWealth =wealth;
//                return maxWealth;
            }

        }
        return maxWealth;



    }
//    static  void ax(){
//        int [] arrr = {1,2,3,4};
//        int sum = 0;
//
//        for (int i = 0; i <arrr.length; i++) {
//
//                sum +=arrr[i];
//
//
//
//
//        }
//        System.out.println(sum);
//
//
//
//    }
}
