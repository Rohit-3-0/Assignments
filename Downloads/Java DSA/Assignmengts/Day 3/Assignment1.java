import java.util.Scanner;
public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        byte b = sc.nextByte();
        System.out.println(Byte.MAX_VALUE + " " + Byte.MIN_VALUE);
        System.out.print("Enter a number: ");
        short sh = sc.nextShort();
        System.out.println(Short.MAX_VALUE + " " + Short.MIN_VALUE);
        System.out.print("Enter a number: ");
        int i = sc.nextInt();
        System.out.println(Integer.MAX_VALUE + " " + Integer.MIN_VALUE);
        System.out.print("Enter a number: ");
        long l = sc.nextLong();
        System.out.println(Long.MAX_VALUE + " " + Long.MIN_VALUE);
        System.out.print("Enter a number: ");
        float f = sc.nextFloat();
        System.out.println(Float.MAX_VALUE + " " + Float.MIN_VALUE);
        System.out.print("Enter a number: ");
        double d = sc.nextDouble();
        System.out.println(Double.MAX_VALUE + " " + Double.MIN_VALUE);
        sc.close();
    }
}