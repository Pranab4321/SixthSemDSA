import java.util.Scanner;

class reverseArray{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] arr = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        reverse(arr, 0, n);
        reverse(arr, 0, k);
        reverse(arr, k, n);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        
    }

    public static void reverse(int [] arr,int s, int l){

        // for(int i=s; i<l; i++){
        //     int temp = arr[i];
        //     arr[i] = arr[l-1];
        //     arr[l-1] = temp;
        //     l--;
        // }

        while(s<l-1){
            int t = arr[s];
            arr[s] = arr[l-1];
            arr[l-1] = t;
            s++;
            l--;
        }
    }
}