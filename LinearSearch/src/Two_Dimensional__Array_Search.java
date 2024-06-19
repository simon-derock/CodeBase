import java.util.Arrays;

public class Two_Dimensional__Array_Search {

    private final static int search(int [] [] array , int find ){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                if(array[i][j]==find){
                    return array[i][j];

                }


            }

        }
        return -1;
    }

    public static void main(String[] args) throws Exception{
        int [] [] array = {
                {55,22,88,444,22},
                {65,80,37,50,24},
                {54,23,62,4,10}

        };
        int to_find = 4;
        System.out.println(search(array,to_find));

    }
}