import java.util.Scanner;

class checkPrime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        boolean isPrime = true;
        int n = sc.nextInt();

        if(n<=1){
            isPrime = false;
        }

        for(int i=2; i<n; i++){
            if(n%i==0){
                isPrime = true;
            }else{
                isPrime = false;
            }
        }

        if(isPrime){
            System.out.print("Prime.");
        }else{
            System.out.print("Not Prime.");
        }
    }
}