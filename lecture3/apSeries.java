import java.util.Scanner;
class apSeries{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int d = sc.nextInt();


        for(int i = a; i<=50; i++){
            System.out.print(a+" ");
            a = (a+d);
        }
    }
}