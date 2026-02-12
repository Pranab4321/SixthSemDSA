import java.util.Scanner;
class maxOfThree{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        maximum(a,b,c);
    }
    public static void maximum(int a,int b,int c){
        if(a>b && a>c){
            System.out.print("a is greater.");
        }else if(b>a && b>c){
            System.out.print("b is greater.");
        }else{
            System.out.print("c is greater.");
        }
    }
}