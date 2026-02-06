import java.util.Scanner;

class pattern5for{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int space = 0;
        int star = n;
        int row = 1;

        for(int i=row; i<=n; i++){
            for(int j=1; j<=space;j++){
                System.out.print("  ");
            }

            for(int k=1; k<=star; k++){
                System.out.print("* ");
            }
            System.out.println();
            space++;
            star--;
            row++;
        }
    }
}