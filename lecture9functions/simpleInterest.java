// import java.util.Scanner;
// class simpleInterest{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int p = sc.nextInt();
//         int r = sc.nextInt();
//         int t = sc.nextInt();
//         interest(p,r,t);
//     }
//     public static void interest(int p,int r,int t){
//         int I = (p*r*t)/100;
//         System.out.print(I);
//     }
// }

import java.util.Scanner;
class simpleInterest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();
        int I = interest(p,r,t);

        System.out.print(I);
    }
    public static int interest(int p,int r,int t){
        int I = (p*r*t)/100;
        return I;
    }
}