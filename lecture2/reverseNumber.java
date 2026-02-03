class reverseNumber{
    public static void main(String[] args){
        int a = 64836;
        int ans = 0;

        while(a>0){
            ans = ans*10 + a%10;
            a = Math.abs(a/10);
        }

        System.out.println(ans);
    }
}