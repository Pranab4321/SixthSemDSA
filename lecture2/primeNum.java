import java.util.Scanner;

class primeNum{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%1== 1 && n%n == 1 ){
            System.out.println(n+ " is a Prime Number");
        }else{
            System.out.println(n+ " is not a Prime Number");
        }
    }
}
