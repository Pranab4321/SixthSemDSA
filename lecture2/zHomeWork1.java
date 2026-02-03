// print all odd numbers from 1 to N

import java.util.Scanner;
class zHomeWork1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=1; i<=N; i++){
            if(i%2 == 1){
                System.out.print(i+" ");
            }
        }
    }
}