import java.util.Scanner;

class pivotIndex{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=1; i<arr.length-2; i++){
            int j=i-1;
            int k=i+1;

            if(arr[i]>arr[k]&&arr[i]>arr[j]){
                System.out.print("The index is : "+i);
                return;
            }
        }
    }
}