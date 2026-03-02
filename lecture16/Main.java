import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];

		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
		int oddSum = 0;
		for(int i=n-1; i>=0; i-=2){
			oddSum += arr[i];
		}

		int evenSum = 0;
		for(int i=n-2; i>=0; i-=2){
			evenSum+=arr[i];
		}

		System.out.println(oddSum);
		System.out.println(evenSum);
		
    }
}