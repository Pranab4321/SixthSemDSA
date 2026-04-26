import java.util.*;
public class lec19 {
    // leetcode question - 
    // 628 - Maximum Product of Three Numbers, 
    // 219 - Contains Duplicate II,
    // 217 - Contains Duplicate,
    // 66 - Plus One,
    // 35 - Search Insert Position,
    // 268 - Missing Number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        missing(n, arr);
    }

    public static void missing(int n, int [] arr){
        int expected = n*(n+1)/2;

        int actualSum = 0;
        for(int i=0; i<n; i++){
            actualSum += arr[i];
        }

        int result = expected - actualSum;

        System.out.print(result);

    }
}
