import java.util.Scanner;


public class Assignment6 
{
    public static void main(String[] args)
    {
        int [] [] arr = new int [3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.println("Enter the element at position [" + i + "][" + j + "]:");
                arr[i][j] = sc.nextInt();
                if(i == j)
                {
                    System.out.println("The Diagnol Elements :" + arr[i][j] );
                }
            }
        }
    }
}