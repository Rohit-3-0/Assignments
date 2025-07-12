
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment5
{
    public static void main(String[] args)
    {   
        List<Integer> positive = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int avg = 0;
        int sum = 0;
        for(int i = 0;i<size ; i++)
        {
            System.out.println("Enter element " + (i+1) + ":");
            arr[i] = sc.nextInt();
            if(arr[i] >= 0)
            {
                positive.add(arr[i]);
            }
        }
        for (int num : positive) 
        {
            sum += num;
        }
        avg = sum / positive.size();
        System.out.println("Positive numbers: " + positive.size());
        System.out.println("Average of positive numbers: " + avg);
    }
}