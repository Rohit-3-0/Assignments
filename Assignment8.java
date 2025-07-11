import java.util.Scanner;

public class Assignment8
{
    public static int divisible3(int [] arr)
    {
        int count = 0;
        for(int i : arr)
        {
            if(i % 3 == 0)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        System.out.println("Enter the size of the array :");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int result = divisible3(arr);
        System.out.println("Count of numbers divisible by 3: " + result);
    }
}