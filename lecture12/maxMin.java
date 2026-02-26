import java.util.Scanner;

class maxMin{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int [] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        printMax(arr);
        printMin(arr);
    }
    public static void printMax(int [] arr){
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max+" is the maximum number.");
    }

    public static void printMin(int [] arr){
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min+" is the minimum number.");
    }
}