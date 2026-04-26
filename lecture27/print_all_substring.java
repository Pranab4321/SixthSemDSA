class print_all_substring {
    public static void main(String[] args){
        String s = "coding";
        int n = s.length();

        for(int i=0; i<n; i++){
            for(int j=i+1; j<=n; j++){
                System.out.println(s.substring(i,j));
            }
        }
    }
}