//         1         
//       2 2 2       
//     3 3 3 3 3     
//   4 4 4 4 4 4 4   
// 5 5 5 5 5 5 5 5 5 

import java.util.Scanner;

class hw1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int row=1;
        int space=n-1;
        int star = 1;

        while(row<=n){
            int i=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }

            int j=1;
            while(j<=star){
                System.out.print(row+" ");
                j++;
            }
            System.out.println();
            row++;
            space--;
            star=star+2;
        }
        sc.close();
    }
}