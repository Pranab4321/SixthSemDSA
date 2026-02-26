import java.util.Scanner;

class findMissing{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 4, 0, 2, 5};
        int n = arr.length;
        int fSum = n*(n+1)/2;
        int tSum = 0;

        for(int i=0; i<n; i++){
            tSum += arr[i];
        } 

        int mis = fSum - tSum;

        System.out.print("The missing number is: "+ mis);
    }
}