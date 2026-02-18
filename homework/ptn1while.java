//       1 
//     2 3 2 
//   3 4 5 4 3
// 4 5 6 7 6 5 4

import java.util.Scanner;

class ptn1while{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int space = n-1;
        int star = 1;

        while(row<=n){
            int i = 1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int l=row;
            int j=1;
            while(j<=star){
                
                System.out.print(l+" ");

                if(j<=star/2){
                    l++;
                }else{
                    l--;
                }
                j++;    
            }
            System.out.println();
            row++;
            space--;
            star+=2;
        }
    }
}