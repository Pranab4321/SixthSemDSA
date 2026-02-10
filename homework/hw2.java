import java.util.Scanner;

class hw2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int row=1;
        int space=n-1;
        int star = 1;
        int count =1;

        while(row<=n){
            int i=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            
            int j=1;
            while(j<=star){
                System.out.print(count+" ");    
                j++;
                count++;
            }
            System.out.println();
            row++;
            space--;
            star=star+2;
        }
        sc.close();
    }
}