import java.util.Scanner;
class pattern4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int space=0;
        int star=n;
        
        for(int row=1; row<=2*n-1; row++){
            for(int i=1; i<=space; i++){
                System.out.print("  ");
            }

            for(int j=1; j<=star; j++){
                System.out.print("* ");
            }

            System.out.println();
            if(row>=n){
                space-=2;
                star++;
            }else{
                space+=2;
                star--;
            }
            
        }
        sc.close();
    }
}