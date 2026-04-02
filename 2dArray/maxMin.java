import java.util.*;
class maxMin {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [][] arr = new int[r][c];

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
                if(arr[i][j] < min){
                    min = arr[i][j];
                }
            }
        }

        System.out.println(max);
        System.out.println(min);
    }
}