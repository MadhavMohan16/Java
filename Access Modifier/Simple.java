class A
{
    private int data=40;
    private void msg()
    {
        System.out.println("Hello world");
    }
}
public class Simple
{
    public static void main(String[]args)
    {
        A ob=new A();
        System.out.println(ob.data);//compile time error
        ob.msg();//compile time error
    }
}
