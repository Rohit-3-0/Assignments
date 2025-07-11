import java.util.Scanner;
public class Assignment10{
    public static void main(String[] args){
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch(n){
            case 1:
                System.out.println("1 loop stopped at one");
                break;
            case 2:
                System.out.println("1,2 loop stopped at two");
                break;
            case 3:
                System.out.println("1,2,3 loop stopped at three");
                break;
            case 4:
                System.out.println("1,2,3,4 loop stopped at four");
                break;
            case 5:
                System.out.println("1,2,3,4,5 loop stopped at five");
                break;
            case 6:
                System.out.println("1,2,3,4,5,6 loop stopped at six");
                break;
            case 7 :
                System.out.println("1,2,3,4,5,6,7 loop stopped at seven");
                break;
            case 8:
                System.out.println("1,2,3,4,5,6,7,8 loop stopped at eight");
                break;
            case 9:
                System.out.println("1,2,3,4,5,6,7,8,9 loop stopped at nine");
                break;
            case 10:
                System.out.println("1,2,3,4,5,6,7,8,9,10 loop stopped at ten");
                break;
        }
    }
}