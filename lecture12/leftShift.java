import java.util.Scanner;

class leftShift{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int [] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        shiftToLeft(arr);
        sc.close();
    }

    public static void shiftToLeft(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int j=i+1;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.print("Left Shift: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}