import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static boolean isAnagram(String s1,String s2){
        char [] firtStringArray = s1.toLowerCase().toCharArray();
        char [] secondStringArray = s2.toLowerCase().toCharArray();

        Arrays.sort(firtStringArray);
        Arrays.sort(secondStringArray);

        return Arrays.equals(firtStringArray, secondStringArray);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firtString = sc.next();
        String secondString = sc.next();

        System.out.println(isAnagram(firtString, secondString));

        sc.close();
    }
}
