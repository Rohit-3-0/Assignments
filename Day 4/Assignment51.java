import java.util.Scanner;
public class Assignment51{
    public static int max(int a, int b)
    {
        int result = (a>b) ? a : b;
        return result;
    }
    public static void main(String[] args)
    {
        System.out.println("Enter two numbers:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = max(a, b);
        System.out.println("Greater value is: " + result);
    }
}