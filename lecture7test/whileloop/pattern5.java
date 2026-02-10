import java.util.Scanner;

class pattern5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int row=1;
        int star=n;
        int count=n;

        while(row<=n){
            int i=1;
            while(i<=n){
                if(count+star==6){
                    System.out.print("* ");
                }else{
                    System.out.print(count+" ");
                }    
                i++;
                count--;
            }
            System.out.println();
            row++;
            star--;
            count=n;

        }
        sc.close();
    }
}