public class findEvenDigits {
    public static void main(String[] args) {
        int [] array = {12,345,2,6,7896};
//        int ans = findDigits(array);
        System.out.println(findDigits(array));

//        System.out.println(ans + '\n');



    }
    static int findDigits(int [] array){
        int c = 0;
        for(int x : array){
            String s = String.valueOf(x);
            int length_ = s.length();
            if(length_ == 0){
                return 0;
            }
            if(length_ % 2 == 0){
                c++;
            }



        }
        return c;

    }
}
