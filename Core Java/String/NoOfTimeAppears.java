import java.util.Scanner;

public class NoOfTimeAppears {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.next().charAt(1);
        int count =0;
        for(int i = 0;i < str.length();i++){
            if( str.charAt(i)== ch){
                count++;
            }
        }
        System.out.println("The no of time "+count);

        sc.close();
    }
}
