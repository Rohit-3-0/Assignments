import java.util.Scanner;
class Assignment3{
    public static void main(String[]args){
        Scanner scanner  = new Scanner (System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        greetuser(name);
    
    }
    public static void greetuser(String name) {
        System.out.println("Hello, " + name + "! Welcome to the MERN + DSA batch.");
    }
}