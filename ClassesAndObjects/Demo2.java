class Test2
{
    int a;
    int b;
    int c;
}
class Demo2
{
    public static void main(String[]args)
    {
        Test2 ob1=new Test2();
        Test2 ob2=new Test2();
        ob1.a=10;
        ob1.b=20;
        ob1.c=30;
        ob2.a=40;
        ob2.b=50;
        ob2.c=60;
        System.out.println(ob1.a+" "+ob1.b+" "+ob1.c);
        System.out.println(ob2.a+" "+ob2.b+" "+ob2.c);
    }
}