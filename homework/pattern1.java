// * * * * * 
// * * * * *
// * * * * *
// * * * * *
// * * * * *

import java.util.Scanner;

class pattern1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int row = 1;
        while(row<=n){
            int i = 1;
            while(i<=n){
                System.out.print("* ");
                i++; 
           }
        System.out.println(); 
        row++;
        }      
    }
}