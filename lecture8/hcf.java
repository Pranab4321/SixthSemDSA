import java.util.Scanner;

class hcf{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a<b){
            int temp = 0;
            temp = a;
            a = b;
            b = temp;
        }

        while(a%b!=0){
                int r= a%b;
                a=b;
                b=r;  
            }
        
        System.out.print(b);    
    }
}