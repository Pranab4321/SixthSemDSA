// find the volume of hemisphere
// V = 2/3(pi*r*r*r)

import java.util.Scanner;
class zHomeWork2c{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        int r = sc.nextInt();

        double pi = 3.14;

        double volume = (2.0/3)*(pi*r*r*r);

        System.out.printf("The volume of hemisphere is : %2f",volume);

    }
}