class A1
{
    private A1()
    {
        System.out.println("Private constructor");
    }
}
public class Simple1
{
    public static void main(String[]args)
    {
        A1 ob=new A1();//compile time error
    }
}
