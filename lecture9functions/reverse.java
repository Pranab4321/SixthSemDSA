// import java.util.Scanner;
// class reverse{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int p = sc.nextInt();
        
//         rev(p);
//     }
//     public static void rev(int p){
//         int ans = 0;
//         while(p>0){
//             int last = p%10;
//             ans = ans*10 + last;
//             p = p/10;
//         }
//         System.out.print("The reverse: "+ans);       
//     }
// }

import java.util.Scanner;
class reverse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        
        int ans = rev(p);
        System.out.print(ans);
    }
    public static int rev(int p){
        int ans = 0;
        while(p>0){
            int last = p%10;
            ans = ans*10 + last;
            p = p/10;
        }
        return ans;
    }
}