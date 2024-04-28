import java.util.Scanner;

public class MinArray {
    static int findMin(int arr[],int n){
        int min = arr[0];
        for(int i = 0 ;i<n;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the lenth of the arrays");
        int n = sc.nextInt();
        System.out.println("Enther the arrys");
        int a[] = new int[n];
        for(int i =0 ;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Min of the array is : " +findMin(a, n));

        sc.close();
    }
}