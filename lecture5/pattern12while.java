import java.util.Scanner;

class pattern12while{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int space = 2*n-3;
        int star = 1;
        int row = 1;

        while(row<=n){
            int i=1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            int j=1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }

            int k=1;
            if(row==n){
                star--;
            }
            while(k<=star){    
                System.out.print("* ");
                k++;
            }

            System.out.println();
            space= space -2;
            star++;
            row++;
        }     
    }
}