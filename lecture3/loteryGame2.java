import java.util.Scanner;

class loteryGame2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n>=300 && n<=460){
            System.out.println("You won a macbook");
            if(n>=300 && n<=380){
            System.out.println("Model: M1 Mac");
            }else if(n>=381 && n<=460){
            System.out.println("Model: M2 Mac");
            }
        }else if(n>=200 && n<=280){
            System.out.println("You won a pack of kurkure");
            if(n>=200 && n<=240){
            System.out.println("Flavour: Chilli flavour");
            }else if(n>=241 && n<=280){
            System.out.println("Flavour: Onion flavour");
            }
        }else if(n>=1100 && n<=1500){
            System.out.println("You won a cycle");
            if(n>=1100 && n<=1300){
            System.out.println("Brand: Avon cycle");
            }else if(n>=1301 && n<=1500){
            System.out.println("Brand: Avon cycle");
            }
        }else if(n>=50 && n<=80){
            System.out.println("You won a bike");
            if(n>=50 && n<=65){
            System.out.println("Model: M1 Mac");
            }else if(n>=65 && n<=80){
            System.out.println("Model: M2 Mac");
            }
        }else{
            System.out.println("Better luck next time.");
        }
    }
}