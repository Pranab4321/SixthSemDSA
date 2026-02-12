import java.util.Scanner;
class maxOfTwo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        maximum(a,b);
    }
    public static void maximum(int a,int b){
        if(a>b){
            System.out.print("a is greater.");
        }else{
            System.out.print("b is greater.");
        }
    }
}