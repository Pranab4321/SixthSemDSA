import java.util.Scanner;
class maxOfThree1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int ans = maximum(a,b,c);

        if(ans==1){
            System.out.print("a is greater.");
        }else if(ans == 2){
            System.out.print("b is greater.");
        }else{
            System.out.print("c is greater.");
        }
    }
    public static int maximum(int a,int b,int c){
        if(a>b && a>c){
            return 1;
        }else if(b>a && b>c){
            return 2;
        }else{
            return 3;
        }
    }
}