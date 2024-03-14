import java.util.Scanner;
public class CountOfNumberOfStair {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the number of stair : ");
        int n = sc.nextInt();
        int result = Fabonacci.fabonacci(n+1);
        System.out.println("The number of way is : "+result);
    }
}
