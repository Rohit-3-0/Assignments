import java.util.Scanner;
public class Assignment9{
    public static int max(int a ,int b, int c)
    {
        if(a>b && a>c){
            return a;
        } else if(b>c && b>a){
            return b;
        } else {
            return c;
        }
    }
    public static void main(String[] args){
        System.out.println("Enter three numbers:");
        Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = max(a, b, c);
        System.out.println("Greatest value is: " + result);
    }

}