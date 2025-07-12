import java.util.Scanner;
public class Assignment4
{
    public static void main(String[] args)
    {
            Scanner sc  = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int a = sc.nextInt();
            System.out.println("Pre-increment (++a)" + (++a)+ " (a is now " + a + ")");
            System.out.println("Post-increment (a++) " + (a++) + " (a is now " + a + ")");
            System.out.println("Pre-decrement (--a) " + (--a)+ " (a is now " + a + ")");
            System.out.println("Post-decrement (a--) " + (a--)+ " (a is now " + a + ")");
    }
}

