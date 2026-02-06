import java.util.Scanner;

class pattern6for{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = 0;
        int star = n;
        int row = 1;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=2*space; j++){
                System.out.print("  ");
            }

            for(int k=1; k<=star; k++){
                System.out.print("* ");
            }
            System.out.println();
            // space= space+2;
            space++;
            star--;
            row++;
           
        }
}
}