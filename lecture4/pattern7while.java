import java.util.Scanner;

class pattern7while{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        while(row<=n){
            int i = 1;
            while(i<=n){
                if(i==1 || row==1 || i==n || row==n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                    i++;
            }
            System.out.println();
            row++;
        }
    }
}