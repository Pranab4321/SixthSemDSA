import java.util.Scanner;

class leftShift{
    public static void leftshift(int [] arr){
        int i = 0;
        int j = i+1;
        while(i<=arr.length-2){
            int a = arr[i];
            int b = arr[j];

            arr[i]=b;
            arr[j]=a;
            i++;
            j++;
        }

        for(int d=0; d<arr.length; d++){
            System.out.print(arr[d]+" ");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        leftshift(arr);
        
    }
}