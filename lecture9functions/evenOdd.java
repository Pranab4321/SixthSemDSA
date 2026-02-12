import java.util.Scanner;
class evenOdd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        add(a);
    }
    public static void add(int a){
        if(a%2==0){
            System.out.print("Even number");
        }else{
            System.out.print("Odd number");
        }
    }
}