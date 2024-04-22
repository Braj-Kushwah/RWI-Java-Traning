import java.util.Scanner;

public class OccuranceOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght of the array");
        int n = sc.nextInt();
        System.out.println("Enter the arrys ");
        int a[] = new int[n];
        for(int i =0; i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter tge no to find occurense");
        int x = sc.nextInt();
        int res = 0;
        for (int i=0; i<n; i++){
            if (x == a[i]){
                res++;
            }
        }
        System.out.println("The occu is : "+res);
    }
}
