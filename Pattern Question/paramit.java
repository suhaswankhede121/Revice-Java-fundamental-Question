import java.util.Scanner;

public class paramit {
    public static void main(String[] args) {
        System.out.println("enter the value of rows and column");
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        for(int i=1;i<=r;i++){
            for (int j=1;j<=r-i;j++){
                System.out.println(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
