class A1
{
    A1()
    {
        System.out.println("Hello A1");
    }
    A1(int x)
    {   
        this();
        System.out.println(x);
    }
}
class TestThis3
{
    public static void main(String[]args)
    {
        A1 a=new A1(5);
    }
}