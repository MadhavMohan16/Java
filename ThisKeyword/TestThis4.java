class A2
{
    A2()
    {
            this(5);
        System.out.println("Hello A2");
    }
    A2(int x)
    {   
        System.out.println(x);
    }
}
class TestThis4
{
    public static void main(String[]args)
    {
        A2 a=new A2();
    }
}