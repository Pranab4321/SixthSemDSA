//         1 
//       1 2 3
//     1 2 3 4 5
//   1 2 3 4 5 6 7
// 1 2 3 4 5 6 7 8 9

import java.util.Scanner;

class question8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
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
                System.out.print(j+" ");
                j++;
            }
            System.out.println();
            row++;
            star=star+2;
            space--;
        }
    }
}