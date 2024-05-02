import java.util.Scanner;

public class Palindrome {

    public static boolean isPalindrom(String s1,String s2){
        return s1.equals(s2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to chek palindrom");
        String str = sc.next();
        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
            rev += str.charAt(i);
        }
        System.out.println("is string palindrom : "+isPalindrom(str, rev));

        sc.close();
    }
}
