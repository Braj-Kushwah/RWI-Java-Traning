public class ReverseString {
    static String tmp ="";
    public static void findReverse(String str){
        for(int i = str.length()-1;i>=0;i--){
            tmp = tmp+str.charAt(i);
        }
    }
    public static void main(String[] args) {
        String str = "Brajesh";
        findReverse(str);
        System.out.println("Reverse is "+tmp);
    }
}
