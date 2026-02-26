import java.util.Scanner;

class rightShift{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int [] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        shiftToRight(arr);
        sc.close();
    }

    public static void shiftToRight(int[] arr){
        
        for(int i=arr.length-1; i>0; i--){
            int j=i-1;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.print("Right Shift: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }        
    }
}