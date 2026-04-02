import java.util.*;
class dipakRose {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            int tmoney = sc.nextInt();

            Arrays.sort(arr);
            int i = 0;
            int j = n-1;
            int num1 = 0;
            int num2 = 0;
            while(i<j){
                if(arr[i]+arr[j]==tmoney){
                    // System.out.println("Pair of roses are "+arr[i]+" and "+arr[j]);
                    num1 = arr[i];
                    num2 = arr[j];
                    i++;
                    j--;
                }else if(arr[i]+arr[j]>tmoney){
                    j--;
                }else{
                    i++;
                }
            }
            test--;
            System.out.println("Deepak should buy roses whose prices are " + num1 + " and " + num2 + ".");
        }
    }
}