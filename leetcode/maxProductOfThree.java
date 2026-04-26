class maxProductOfThree{
    public static void main(String[] args){
        int [] arr = {-100,-98,-1,2,3,4};
        // min1<min2
        int min1 = Integer.MAX_VALUE; // + infinity
        int min2 = Integer.MAX_VALUE; // + infinity

        // max1> max2> max3
        int max1 = Integer.MIN_VALUE; // - INFINITY
        int max2 = Integer.MIN_VALUE; // - INFINITY
        int max3 = Integer.MIN_VALUE; // - INFINITY

        for(int i=0; i<arr.length; i++){
            if(arr[i]<=min1){
                int a = min1;
                min1 = arr[i];
                min2 = a;
            }else if(arr[i]<= min2){
                min2 = arr[i];
            }

            if(arr[i]>= max3){
                int b = max3;
                max3 = arr[i];
                int c = max2;
                max2 = b;
                max1 = c;
            }else if(arr[i]>= max2){
                int c = max2;
                max2 = arr[i];
                max1 = c;
            }else if(arr[i]>= max1){
                max1 = arr[i];
            }
        }

        int result = Math.max(min1*min2*max3, max1*max2*max3);
        System.out.println(result);

    }
}


// class Solution {
//     public int maximumProduct(int[] a) {
//         int n = a.length;
//         Arrays.sort(a);
//         int p = a[0]*a[1]*a[n-1];
//         int q = a[n-1]*a[n-2]*a[n-3];

//         if(p>q){
//             return p;
//         }else{
//             return q;
//         }
//     }
// }