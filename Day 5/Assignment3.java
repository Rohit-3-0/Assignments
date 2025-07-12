import java.util.Scanner;
public class Assignment3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the element :");
        int size = scanner.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter the elements :");
        for(int i = 0; i < size; i++)
        {
            arr[i] = scanner.nextInt();
        }
        int largest = arr[0];
        for(int i = 0;i<size;i++)
        {
            if (arr[i] > largest)
            {
                largest = arr[i];
            }
        }
        
        System.out.println("Maximum Element :"+ largest);
        String ODDmax = (largest%2 !=0 )? "Number is odd" : "Number is even";
        System.out.println(ODDmax);
    }
}