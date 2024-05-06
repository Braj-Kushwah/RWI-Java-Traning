import java.util.*;

public class RemoveDuplicates {

    public static void removeDuplicate(int arr[],int n){

        HashSet<Integer> hs = new HashSet<>();
        for(int i =0 ;i<n;i++){
            hs.add(arr[i]);
        }
        for(int i : hs){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n  = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the array one by one ");
        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Entered array is ");
        for(int i =0 ;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();

        System.out.println("Afther removing Duplicates");
        removeDuplicate(a, n);

        sc.close();

    }
}
