//Calculate the prime factors of n

import java.util.Scanner;

class question5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        for(int i=1;i<=n;i++){
            if(n%i==0){
            
            int prime = checkPrime(i);

            if(prime==1){
                System.out.print(i+" ");
            }
            }
        }    
    }

    public static int checkPrime(int i){
        int isPrime = 1;

        if(i<2){
            isPrime = 0;
        }

        if(i == 2){
            isPrime = 1;
        }else{
            for(int j=2; j<i; j++){
                if(i%j==0){
                    isPrime=0;
                }
            }
        }

        return isPrime;
    }
}