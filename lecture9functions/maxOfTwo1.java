import java.util.Scanner;
class maxOfTwo1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = maximum(a,b);
        if(c==1){
            System.out.print("a is greater.");
        }else{
            System.out.print("b is greater");
        }
        
    }
    public static int maximum(int a,int b){
        if(a>b){
            return 1;
        }else{
            return 0;
        }
    }
}