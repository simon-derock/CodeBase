import java.util.Arrays;

public class Search_on_String {

    public static void main(String[] args) {

        String s = "orange";
        char  fi = 'g';
        Str();


        System.out.println(search_for_str(s,fi));
//        System.out.println(Arrays.toString());
//        int []
//        System.out.println(String_Search(s,fi));
//        System.out.println(search_str(s,fi));

//        System.out.println(v_search());
    }
    public static final boolean String_Search(String s, char fi){
        if(s.length()==0){
            return false;
        }
        for (int i = 0; i <s.length() ; i++) {
            if(fi==s.charAt(i)){
                return true;
            }

        }
        return false;





    }
    public static final boolean search_str(String ss , char findit){
        if(ss.length()==0) return false;
        for(char findt : ss.toCharArray()){
            if(findit==findt){
                return true;
            }
        }
        return false;


    }

//    public final static  int v_search(int arr[], int key){    }



    private final static char search_for_str(String my_name ,  char word){
        if(my_name.length()==0){
            return '!';
        }

            for (char i = 0; i <my_name.length() ; i++) {
                if(word==my_name.charAt(i)){
                    return word;
                }

            }
        return '!';


        }

    public static void Str() {

        String [] aa = {"apple", "orange"};
        System.out.println(Arrays.toString(aa));

    }





    }







