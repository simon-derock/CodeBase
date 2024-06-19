public class String_Reverse {
    public static void main(String[] args) {
        String name = "qwerty";
        System.out.println(my_Reverse(name));
    }
    static String my_Reverse(String name){
        String res = "";
        for(int s = name.length() -1; s>=0;s--){
            res += name.charAt(s);


        }
        return res;
    }
}