import java.util.Scanner;

class swapping{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        swapByTemp(a, b);
        swapWithoutTemp(a, b);
        swapByXOR(a, b);
    }

    public static void swapByTemp(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap a = "+a+" and b = "+b);
    }

    public static void swapWithoutTemp(int a, int b){
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After swap a = "+a+" and b = "+b);
    }

    public static void swapByXOR(int a, int b){
        a = a^b;
        b = a^b;
        a = a^b;
        
        System.out.println("After swap a = "+a+" and b = "+b);
    }
}