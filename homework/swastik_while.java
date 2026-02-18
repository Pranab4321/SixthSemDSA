// *         * * * * * * 
// *         *
// *         *
// *         *
// *         *
// * * * * * * * * * * *
//           *         *
//           *         *
//           *         *
//           *         * 
// * * * * * *         *

import java.util.Scanner;
class swastik_while{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i=0; i<=2*n;i++){
            for(int j=0; j<=2*n;j++){
                if((i==0&&j>n)|| i==n || (i==2*n&&j<n)|| (j==0&&i<n)|| (j==n)||(j==2*n&&i>n)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }
    }
}