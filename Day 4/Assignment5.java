import java.util.Scanner;
public class Assignment5{
    public static int max(int a, int b)
    {
        if(a>b)
        {
            return a;
        }
        else 
        {
            return b;
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Enter two numbers:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = max(a, b);
        System.out.println("Greatervalue is: " + result);
    }
}