// sum of digits of a number

import java.util.Scanner;
class zHomeWork3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int sum = 0;
        while(num>0){
            int lastdigit = num%10;
            sum = sum + lastdigit;
            num = Math.abs(num/10);
        }
        System.out.print(sum);
    }
}