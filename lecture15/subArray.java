// Brute force approach maximum sub array sum O[n^2]

class subArray{
    public static void main(String[] args){
        // int [] arr = {3,-4,5,4,-1,7,-8};
        int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int n= arr.length;
        int ms = 0;
        for(int st=0; st<n; st++){
            int cs = 0;
            for(int end=st; end<n; end++){
                cs += arr[end];
                ms = Math.max(cs, ms);
            }
        }
        System.out.print("Maximum sum is :"+ms);
    }
}