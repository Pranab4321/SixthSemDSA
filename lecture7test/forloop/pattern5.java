import java.util.Scanner;

class pattern5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int num=n;
        for(int row=1; row<=n; row++){
            for(int i=1; i<=n; i++){
                if(row+i==6){
                    System.out.print("* ");
                }else{
                    System.out.print(num+" ");
                }
                num--;
            }

            System.out.println();
            num=n;
        }
        sc.close();
    }
}