import java.util.Scanner;
public class Assignment7{
    public static int getsquares(){
        Scanner scanner =  new Scanner(System.in);
        int num = scanner.nextInt();
        return num*num;
    }
    public static void main(String[] args){
        System.out.println("Enter a number to get square :");
        int result = getsquares();
        System.out.println("Square of the number :" + result);
        
        
    }
    
}