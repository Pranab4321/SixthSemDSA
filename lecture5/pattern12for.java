import java.util.Scanner;

class pattern12for{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 1;
        int space = 2*n-3;

        for(int i=1; i<=n; i++){
            for(int a=1; a<=star; a++){
                System.out.print("* ");
            }

            for(int b=1; b<=space; b++){
                System.out.print("  ");
            }

            if(star==n){
                star--;
            }
            
            for(int c=1; c<=star; c++){
                System.out.print("* ");
            }

            System.out.println();
            star++;
            space = space-2;
        }       
    }
}