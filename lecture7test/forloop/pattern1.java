import java.util.Scanner;

class pattern1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num=1;
        for(int row=1;row<=n;row++){
            for(int i=1; i<=num; i++){
                System.out.print(i+" ");
            }
            System.out.println();
            num++;
        }
    }
}