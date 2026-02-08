import java.util.Scanner;

class pattern10for{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = n-1;
        int star = 1;

        for(int i=1; i<=n; i++){
            for(int a=1; a<=space; a++){
            System.out.print("  ");
            }

            for(int b=1; b<=star; b++){
                if(b%2==1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            System.out.println();
            space = space-1;
            star = star+2;
        }
        
    }
}