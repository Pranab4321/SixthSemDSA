// Print the prime numbers upto n

import java.util.Scanner;

class question4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1; i<=n; i++){
            int prime = checkPrime(i);
            if(prime==1){
                System.out.print(i+" ");
            }
        }
    }

    public static int checkPrime(int p){
        int isPrime = 1;
        if(p<2){
            isPrime = 0;
        }
        if(p==2){
            isPrime=1;
        }
        else{
            for(int i=2; i<p; i++){
                if(p%i==0){
                    isPrime=0;
                }
            }
        }

        return isPrime;
    }
}