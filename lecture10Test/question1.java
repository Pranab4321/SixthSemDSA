// Find the reverse of a number

import java.util.Scanner;

class question1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ans = reverse(n);

        System.out.print(ans);
    }

    public static int reverse(int a){
        int ans=0;
        while(a>0){
            int last = a%10;
            ans = ans*10+last;
            a = a/10;
        }
        return ans;   
    }
}