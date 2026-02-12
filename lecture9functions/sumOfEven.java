// import java.util.Scanner;
// class sumOfEven{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         sumOfEven(n);
//     }
//     public static void sumOfEven(int n){
//         int sum =0;
//         for(int i=1; i<=n; i++){
//             if(i%2==0){
//                 sum = sum + i;
//             }
//         }
//         System.out.print(sum);
//     }
// }

import java.util.Scanner;
class sumOfEven{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sumOfEven(n);
        System.out.print(sum);
    }
    public static int sumOfEven(int n){
        int sum =0;
        for(int i=1; i<=n; i++){
            if(i%2==0){
                sum = sum + i;
            }
        }
        return sum;
    }
}