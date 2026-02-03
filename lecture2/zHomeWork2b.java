// find the volume of cylinder
//V = pi*r*r*h

import java.util.Scanner;
class zHomeWork2b{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        int r = sc.nextInt();
        System.out.print("Enter height: ");
        int h = sc.nextInt();

        double pi = 3.14;

        double volume = pi*r*r*h;

        System.out.printf("The volume of cylinder is : %2f",volume);

    }
}