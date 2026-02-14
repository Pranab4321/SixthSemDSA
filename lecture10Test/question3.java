// Determining the highest common factor

import java.util.Scanner;

class question3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = gcd(a,b);

        System.out.print(ans);
    }

    public static int gcd(int a,int b){
        if(b>a){
            int temp=a;
            a=b;
            b=temp;
        }
        if(a>b){
            while(a%b!=0){
                int rem = a%b;
                a=b;
                b=rem;
            }
        }
        
        return b;
    }
}