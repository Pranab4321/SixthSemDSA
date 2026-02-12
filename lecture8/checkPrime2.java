class checkPrime2{
    public static void main(String[] args){

        for(int a=1; a<=100; a++){
            boolean isPrime = true;
            if(a<=1){
                isPrime = false;
            }

            for(int i=2; i<a; i++){
                if(a%i==0){
                    isPrime = false;
                    break ;
                }
            }

            if(isPrime){
                System.out.print(a+" ");
            }
        }    
    }
}