class insertionSort{
    public static void main(String[] args){
        int [] arr = {3,5,4,7,1,9};
        int n = arr.length;
        sort(arr,n);

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void sort(int [] arr, int n){
        for(int i=1; i<n; i++){
            int temp = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
}