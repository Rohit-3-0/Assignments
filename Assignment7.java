import java.util.Scanner;


public class Assignment7
{
    public static void main(String[] args)
    {
        Scanner Scanenr = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int x;
        int sum = 0;
        do 
        {
            x = Scanenr.nextInt();
            sum += x;

        }while( x !=0);
    System.out.println("The sum is :" + sum);
    }
    
}