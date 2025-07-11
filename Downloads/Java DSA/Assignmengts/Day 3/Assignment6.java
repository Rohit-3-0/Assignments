import java .util.Scanner;
public class Assignment6
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter a number 2: ");
        int b = sc.nextInt();
        System.out.println("Values before swap : "+"A :" + a + " |B :" + b);
        a = a ^ b ;
        b = a ^ b;
        a = a ^ b ;
        System.out.println("Values after swap : "+"A :" + a + " |B :" + b);
    }
}