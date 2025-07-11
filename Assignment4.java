
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment4
{
    public static void main(String[] args)
    {
        int arr[] = {10,20,30,40,50,60,70,80,90,100};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        List<Integer> LargeNum = new ArrayList<>();
        for(int i : arr) 
        {
            if(i > number)
            {
                LargeNum.add(i);
            }
        }
        System.out.println("Numbers greater than " + number + ": " + LargeNum.size());
        System.out.println("The numbers are: " + LargeNum);
    }
}