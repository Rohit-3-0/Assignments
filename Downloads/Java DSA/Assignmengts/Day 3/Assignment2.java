    import java.util.Scanner;
    public class Assignment2
    {
        public static void main (String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number");
            int a  = sc.nextInt();
            System.out.println("Enter a number");
            int b  = sc.nextInt();
            System.out.println("Sum: " + (a + b));
            System.out.println("Subtraction: " + (a - b));
            System.out.println("Multiplication: " + (a * b));
            System.out.println("Division: " + (a / b));
            System.out.println("Division: " + (a % b));
            System.out.println("Greater than: " + (a > b));
            System.out.println("Division: " + (a < b));
            System.out.println("Equal to: " + (a == b));
            System.out.println("Logical and " + (a > 5 && b < 10));
            System.out.println("Logical or" + (a > 10 || b < 5));
            System.out.println("Bitwise and " + (a&b));
            System.out.println("Bitwise or " + (a|b));
            System.out.println("Bitwise xor " + (a^b));
            System.out.println("Left shift " + (a << 1));
            System.out.println("Right shift " + (a >> 1));

        }
    }