import java.util.Scanner;
public class Assignment1{
    public static void main(String[] args){
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Original Binary:" + Integer.toBinaryString(n));
        System.out.println(~n);
        System.out.println("Binary:" + Integer.toBinaryString(~n));
    }
}