import java.util.Scanner;

public class  MaxArray{

    public static int findMax(int arr[],int n){
        int max = arr[0];
        for(int i = 0;i<n;i++){
            if(arr[i] > max){
                max = arr[i];
            }   
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght of the array");
        int n = sc.nextInt();
        System.out.println("Enter the arrys ");
        int a[] = new int[n];
        for(int i =0; i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Max arrys is : "+findMax(a, n));
    }
}
