class leetcode42{
    public static void main(String[] args){
        int [] ht = {4,2,0,3,2,5};
        int n = ht.length;

        int waterHold =0;
        for(int i=1; i<n-1; i++){
            int rMax = 0;
            for(int j=i+1; j<n; j++){
                if(ht[j]>ht[i]){
                    rMax = ht[j];
                }
            }

            int lMax = 0;
            for(int k=i-1; k>=0; k--){
                if(ht[k]>ht[i]){
                    lMax=ht[k];
                }
            }

            waterHold+=(Math.min(rMax,lMax)-ht[i]);
        }

        System.out.print("Total water holded :"+waterHold);

    }
}