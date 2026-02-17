import java.util.Scanner;

class swastik_while{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int row = 1;
        int star = 1;
        int space = n-1;

        while(row<=2*n-1){
            int i=1;
            while(i<=star){
                if(row==2*n-1){
                    System.out.print("* ");
                    i++;
                }else if(row>n){
                    System.out.print("  ");
                    i++;
                }else{
                    System.out.print("* ");
                    i++;
                }   
            }

            int j=1;
            while(j<=space){
                
                if(j<space){
                    if(row==n || row==2*n-1){
                        System.out.print("* ");
                        j++;
                    }else{
                        System.out.print("  ");
                        j++;
                    }
                     
                }else{
                    System.out.print("* ");
                    j++;
                }
            }

            int k=1;
            while(k<=space){
                if(row==1 || row==n){
                    System.out.print("* ");
                    k++;
                }else{
                    if(row>n){
                        if(k==space){
                            System.out.print("* ");
                            k++;
                        }else{
                            System.out.print("  ");
                            k++;
                        }
                    }else{
                        System.out.print("  ");
                        k++;
                    }
                }
            }
            System.out.println();
            row++;
        }
    }
}