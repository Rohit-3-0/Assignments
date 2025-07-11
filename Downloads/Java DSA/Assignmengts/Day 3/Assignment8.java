import java.util.Scanner;
public class Assignment8{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of Rectangle :");
        float l = sc.nextFloat();
        System.out.println("Enter Breadth of Rectangle :");
        float b = sc.nextFloat();
        System.out.println("Area of Rectangle :" + l*b );
        System.out.println("Perimeter of Rectangle :" + (2*(l*b)));
        
    }
}