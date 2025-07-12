
import java.util.Scanner;

public class Assignment3
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a byte Value,short value,charvalue,int value");

        byte b = sc.nextByte();
        short s  = sc.nextShort();
        char c = 'A';
        int i = sc.nextInt();
        int result = b + s + c + i;
        System.out.println("Result:" + result + "|A :" + (int)c);
    }

}