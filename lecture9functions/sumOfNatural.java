// import java.util.Scanner;
// class sumOfNatural{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         sumOfN(n);
//     }
//     public static void sumOfN(int n){
//         int sum = n*(n+1)/2;
//         System.out.print(sum);
//     }
// }

import java.util.Scanner;
class sumOfNatural{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sumOfN(n);
        System.out.print(sum);
    }
    public static int sumOfN(int n){
        int sum = n*(n+1)/2;
        return sum;
    }
}
