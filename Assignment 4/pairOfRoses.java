import java.util.*;
class pairOfRoses{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("test input:");
        int test = sc.nextInt();
        while(test-- >0){
            System.out.println("number of roses, array size:");
            int N = sc.nextInt();
            int [] arr = new int[N];
            System.out.println("N number of integers input:");
            for(int i=0; i<N; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.println("Total money dipak has:");
            int M = sc.nextInt();

            int minDiff = Integer.MAX_VALUE;
            int x=0, y=0;
            for(int i=0; i<N-1; i++){
                int j = i+1;
                while(j < N){
                    if(arr[i]+arr[j]==M){
                            int diff = arr[j]-arr[i];
                            if(diff < minDiff){
                                minDiff = diff;
                                x = arr[i];
                                y = arr[j];
                            }
                    }
                    j++;
                    
                }
            }
            System.out.println("dipak should buy roses of prize "+x+" and "+y);
            System.out.println();
        }
    }
}