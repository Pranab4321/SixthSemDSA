// Kadane's Algorithm maximum sub array sum O[n]

class leet53{
    public static void main(String[] args){
        // int [] arr = {3,-4,5,4,-1,7,-8};
        int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int n = arr.length;
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            cs+=arr[i];
            ms=Math.max(cs,ms);
            if(cs<0){
                cs=0;
            }
        }
        System.out.print("The max sum is : "+ms);
    }
}