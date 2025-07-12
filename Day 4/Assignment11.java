import java.util.Scanner;
public class Assignment11{
    public static void main(String[] args){
        System.out.println("Enter your weight in kg");
        Scanner sc = new Scanner(System.in);
        float weight = sc.nextFloat();
        System.out.println("Enter your height in meters");
        float height = sc.nextFloat();
        float bmi = weight / (height * height);
        System.out.println("Your BMI is: " + bmi);
    }
}