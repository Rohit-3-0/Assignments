import java.util.Scanner;
public class Assignment2
{
    public static void main(String[] args)
    {
        System.out.println("Enter a negative number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Signed right shift:" + (n >> 2));
        System.out.println("Unsigned right shift:" + (n >>> 2));
    }
}