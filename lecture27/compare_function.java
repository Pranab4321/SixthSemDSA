import java.util.*;
class compare_function{
    public static void main(String[] args){
        String a = "komal";
        String b = "kunal";
        int ans = compare(a,b);
        System.out.print(ans);
    }
    public static int compare(String s1, String s2){
        int s3 = s1.compareTo(s2);
        return s3;   
    }
}