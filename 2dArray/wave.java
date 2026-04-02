import java.util.*;
class wave {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [][] arr = new int[r][c];

        // input 2d array
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
             }
        }

        for(int j=0; j<c; j++){
            if(j%2 == 0){
                for(int i=0; i<r; i++){
                    System.out.print(arr[i][j]+" ");
                }    
            }else{
                for(int i=0; i<r; i++){
                    System.out.print(arr[i][j]+" ");
                }
            }

            System.out.print(" ");
        }
    }
}