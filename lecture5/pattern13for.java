import java.util.Scanner;

class pattern13for{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int star = n;
        int space = 0;
        int row = 1;

        for(int a=row;a<=n;a++){
            for(int i=1;i<=star;i++){
                System.out.print("* ");
            }
            for(int j=1;j<=space;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=star;k++){
                System.out.print("* ");
            }
           
            System.out.println();
            star--;
            space=space+2;
        }
        sc.close();
    }
}