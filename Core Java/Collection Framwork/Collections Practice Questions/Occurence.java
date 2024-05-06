import java.util.*;

public class Occurence {

    public static void countOccurence(int []arr,int n){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i =0 ;i<n;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }else{
                hm.put(arr[i], 1);
            }
        }

        for(Map.Entry<Integer,Integer> i : hm.entrySet()){
            System.out.println(i.getKey()+" occurce "+i.getValue()+" times");
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

        System.out.println("After the count Occurence");
        countOccurence(a, n);

        sc.close();
    }
}