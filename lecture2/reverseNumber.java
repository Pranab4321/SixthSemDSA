class reverseNumber{
    public static void main(String[] args){
        int a = 64836;
        int length = String.valueOf(a).length();
        int ans = 0;
        for(int i=0; i< length ;i++){
            int lastNum = a%10;
            int next = Math.abs(a/10);
            ans = (ans*10) + lastNum;
        }
        System.out.println(ans);
    }
}