import java.util.Scanner;

class ptn1while{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int row = 1;
        int space =n-1;
        int star = 1;

        while(row<=n){
            int i=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }

            int j=row;
            while(j<=star){
                System.out.print(j+" ");
                j++;
            }

            int k=star-1;
            while(k>=row){
                System.out.print(k+" ");
                k--;
            }

            System.out.println();
            row++;
            star=star+2;
            space--;
        }
    }
}