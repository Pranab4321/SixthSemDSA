import java.util.Scanner;

class findElement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                System.out.print("target value is "+target);
                return;
            }
        }
        System.out.print(target+ "not found");

        sc.close();
    }
}