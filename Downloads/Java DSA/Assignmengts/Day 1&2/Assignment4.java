import java.util.Scanner;

public class Assignment4{
    public static void changevalue(int x)
    {
    x = 100;
    System.out.println("Value inside function: " + x);
    }
    public static void main(String[] args)
    {
        Scanner scanner  = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        System.out.println("Value before function call: " + number);
        changevalue(number); 
        System.out.println("Value after function call: " + number);
        scanner.close();
    }
}