import java.util.Scanner;
class Assignment2 {
    public static void main(String[] args){
        Scanner scanner  = new Scanner(System.in);
        
        int number1 = scanner.nextInt();
        float number2  = number1;
        

        float decimalNumber = scanner.nextFloat();
        int number3 = (int) decimalNumber;
       
        String text = scanner.next();
        int number4 = Integer.parseInt(text);

        System.out.println("Int to 0float: " + number2);
        System.out.println("Float to int: " + number3);
        System.out.println("String to int: " + number4);
    }
}
