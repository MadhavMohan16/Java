class TestOverloading3
{
    public static void main(String[]args)
    {
        System.out.println("Main with string[]");
    }
    public static void main(String args)
    {
        System.out.println("Main with string");
    }
    public static void main()
    {
        System.out.println("Main without args");
    }
}