import java.util.Scanner; // ← This line is mandatory to use Scanner

// class Input{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter your name :");
//         String name = scanner.nextLine();
//         System.out.println("Hello, " + name + "!");
//         scanner.close();
//     }
// }

class Input{
    public static void main(String[] args)
    {
        Scanner scanner  = new Scanner(System.in);
        // System.out.print("Enter an integer: ");
        int x = scanner.nextInt();
        System.out.println("You entered: " + x);

    }
}