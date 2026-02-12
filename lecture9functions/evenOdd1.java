import java.util.Scanner;
class evenOdd1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= add(a);
        if(b==0){
            System.out.print("Even number");
        }else{
            System.out.print("Odd number");
        }
    }
    public static int add(int a){
        int b = a%2;
        return b;
    }
}