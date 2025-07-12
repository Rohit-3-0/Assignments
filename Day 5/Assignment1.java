import java.util.*;;
public class Assignment1
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();
        int [] arr = new int [size];
        int evensum = 0;
        List<Integer> even = new ArrayList<>();
        for (int i = 0; i< size; i++)
        {
            arr[i] = sc.nextInt();
            if(arr[i] % 2 == 0)
            {
                evensum += arr[i];
                even.add(arr[i]);
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Sum of even numbers: " + evensum);
        System.out.println("Even numbers: " + even.size());
    }
}

// import java.util.Arrays;
// import java.util.Scanner;
// public class Assignment1
// {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of the array :");
//         int size = sc.nextInt();
//         int [] arr = new int [size];
//         int evensum = 0;
//         for (int i = 0; i< size; i++)
//         {
//             arr[i] = sc.nextInt();
//             evensum+= (arr[i] % 2 == 0) ? arr[i] : 0; // Add to evensum only if the number is even
//         }
//         System.out.println(Arrays.toString(arr));
//         System.out.println("Sum of even numbers: " + evensum);
//     }
// }