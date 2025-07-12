class Assignment6
{
    public static void secondMethod()
    {
        System.out.println("Second method started");
        System.out.println("Second method ended");
    }
    public static void firstMethod()
    {
        System.out.println("First method started");
        secondMethod();
        System.out.println("First method ended");
    }
    public static void main(String[] args)
    {
        System.out.println("Main method started");
        firstMethod();
        secondMethod();
        System.out.println("Main method ended");
    }
}