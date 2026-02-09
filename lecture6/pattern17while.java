import java.util.Scanner;

class pattern17while{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int row=1;
        int star =n-1;
        int space=1;

        while(row<=2*n-1){
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
            while(k<=star){
                System.out.print("* ");
                k++;
            }

            System.out.println();
            if(row>=n){
                star++;
                space=space-2;
            }else{
                star--;
                space=space+2;
            }
            row++;
        }
        sc.close();
    }
}
