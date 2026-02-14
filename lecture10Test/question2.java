//Factorial of n

import java.util.Scanner;

class question2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ans = factorial(n);

        System.out.print(ans);
    }

    public static int factorial(int a){
        int fact=1;
        for(int i=1;i<=a;i++){
            fact = fact*i;
        }
        
        return fact;   
    }
}