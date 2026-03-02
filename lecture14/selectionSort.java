class selectionSort{
    public static void main(String[] args){
        int[] arr = {9,2,7,8,5,6};
        int n = arr.length;
        sort(arr, n);

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void sort(int [] arr, int n){
        
        int min=0;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){    
                if(arr[j]<arr[min]){
                    min=j;
                }
            }

            int temp= arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}