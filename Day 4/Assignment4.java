import java.util.Scanner;
public class Assignment4 {
    public static void main(String[] args){
        System.out.println("Enter a float number:");
        Scanner sc = new Scanner(System.in);
        float f  = sc.nextFloat();
        System.out.println("To int: " + (int)f + "| To byte :" + (byte)f);


    }
}