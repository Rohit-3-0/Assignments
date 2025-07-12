import java.util.Scanner;
public class Assignment3 
{
    public static void main(String[] args)
    {
        Scanner sc  = new Scanner (System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        String S = ((a%2 == 0) ? "The number is Even" : "The number is Odd");
        System.out.println(S);
    }
}