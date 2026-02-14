// * * * * * * * * * * * * 
// * * * * *     * * * * *
// * * * *         * * * * 
// * * *             * * * 
// * *                 * *
// *                     *

import java.util.Scanner;

class question7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int row=1;
        int space=0;
        int star = n;

        while(row<=n){
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
            row++;
            star--;
            space=space+2;
        }
    }
}