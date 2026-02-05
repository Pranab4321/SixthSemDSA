import java.util.Scanner;

class pattern3while{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        while(row<=n){
            int i = n;
            while(i>=row){
                System.out.print("* ");
                i--;
            }
            System.out.println();
            row++;
        }
    }
}