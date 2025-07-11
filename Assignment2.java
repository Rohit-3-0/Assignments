import java.util.*;
public class Assignment2
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();
        int [] arr = new int [size];
        int i = 0;
        // int [] odd = new int[]
        List<Integer> odd  = new ArrayList<>();
        while (i< size)
        {
            arr[i] = sc.nextInt();
            if(arr[i] % 2 != 0)
            {
                odd.add(arr[i]);
            }
            i++;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("odd numbers: " + odd.size());
    }
}
