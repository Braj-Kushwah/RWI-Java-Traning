public class NumPatternDemo6 {
    public static void main(String[] args) {
        int count = 1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print(count);
                count++;
                if(count == 10){
                    count = 1;
                }
            }
            System.out.println();
        }
    }
}
