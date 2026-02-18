//         1   
//       2 3 4 
//     5 6 7 8 9
//   10 11 12 13 14 15 16
// 17 18 19 20 21 22 23 24 25

import java.util.Scanner;

class hw2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int row=1;
        int space=n-1;
        int star = 1;
        int count =1;

        while(row<=n){
            int i=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            
            int j=1;
            while(j<=star){
                System.out.print(count+" ");    
                j++;
                count++;
            }
            System.out.println();
            row++;
            space--;
            star=star+2;
        }
        sc.close();
    }
}