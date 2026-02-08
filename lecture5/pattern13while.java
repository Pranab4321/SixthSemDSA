import java.util.Scanner;

class pattern13while{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int star = n;
        int space = 0;
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
            if(star==n){
                star--;
            }
            while(k<=star){
                System.out.print("* ");
                k++;
            }
            if(star==n-1){
                star++;
            }
            System.out.println();
            star++;
            space=space+2;
            row++;
        }
    }
}