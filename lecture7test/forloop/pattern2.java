import java.util.Scanner;

class pattern2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int star=n-1;
        int space=1;
        for(int row=1; row<=n; row++){
            for(int i=1; i<=star; i++){
                System.out.print("* ");
            }

            for(int j=1; j<=space; j++){
                System.out.print("  ");
            }

            for(int k=1; k<=star; k++){
                System.out.print("* ");
            }
            System.out.println();
            space=space+2;
            star--;
        }
    }
}