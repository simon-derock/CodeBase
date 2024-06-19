public class Search_a_2D_Matrix {
    public static void main(String[] args) {
        int [] [] array = { {1,2,3},{4,5,6} ,{7,8,9} };
        int target = 6;
        System.out.println(searchMatrix(array, target));
    }

        public static boolean searchMatrix(int[][] matrix, int target) {
        boolean a = true;
            for(int i=0; i<matrix.length ;i++){
                for(int j=0; j <matrix[i].length; j++){
                    a =  (matrix[i][j]==target);
                    return a;
//                    if(matrix[i][j]==target){
//                        return true;
//                    }

                }
            }
            return a;

        }
    }

