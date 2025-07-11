import java.util.Arrays;

public class Assignment5{
    public static void modifyarray(int[] arr)
    {
        arr[0] = 99;
        System.out.println("Inside function: " + Arrays.toString(arr));
    }
    public static void main(String[] args)
    {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Before function call: " + Arrays.toString(numbers));
        modifyarray(numbers);
        System.out.println("After function call: " + Arrays.toString(numbers));
    }
}   

