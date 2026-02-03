import java.util.Scanner;
class gradeProblem{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if(a<30){
            System.out.println("Grade D"); 
        }else if(a<50){
            System.out.println("Grade C"); 
        }else if(a<80){
            System.out.println("Grade B"); 
        }else{
            System.out.println("Grade A"); 
        }
    }
}