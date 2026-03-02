class bubbleSort{
    public static void main(String[] args){
        int [] arr = {1,2,5,8,3,4,6};
        int n = arr.length;
        sort(arr, n);

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void sort(int[] arr, int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }    
    }
}