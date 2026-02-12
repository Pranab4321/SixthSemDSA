import java.util.Scanner;

class allEvenNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            int a = fn(i);
            if(a==i){
                System.out.print(a+" ");
            }
        }
    }

    public static int fn(int i){
        if(i%2==0){
            return i;
        }
        return 0;
    }
}