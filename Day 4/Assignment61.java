import java.util.Scanner;
public class Assignment61{
    public static void printMultiplicationTable(int num) {
            System.out.println(num*1);
            System.out.println(num*2);
            System.out.println(num*3);
            System.out.println(num*4);
            System.out.println(num*5);
            System.out.println(num*6);
            System.out.println(num*7);
            System.out.println(num*8);
            System.out.println(num*9);
            System.out.println(num*10);
    }
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printMultiplicationTable(num);
    }
}