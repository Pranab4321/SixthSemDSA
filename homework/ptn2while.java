//       1 
//     2 3 4
//   5 6 7 8 9
// 10 11 12 13 14 15 16

import java.util.Scanner;
class ptn2while{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int space = n-1;
        int star = 1;
        int l = 1;
        for(int i=1; i<=n; i++){
            for(int a=1;a<=space; a++){
                System.out.print("  ");
            }

            for(int b=1; b<=star; b++){
                System.out.print(l+" ");
                l++;
            }
            System.out.println();
            space--;
            star+=2;
        }
    }
}