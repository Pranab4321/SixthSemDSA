import java.util.Scanner;

class pattern9for{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 2*n-1;
        int space = 0;

        for(int i=1; i<=n; i++){
            for(int b=1; b<=space; b++){
                System.out.print("  ");
            }
            for(int a=1; a<=star; a++){
                System.out.print("* ");
            }

            System.out.println();
            star= star-2;
            space++;
        }
    }
}