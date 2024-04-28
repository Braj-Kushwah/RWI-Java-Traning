public class AlfaPatternDemo4 {
    public static void main(String[] args) {     
        for(char i = 'A';i<='E';i++){
            for(char j = 'E';j>='A';j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
