public class IsAliveMethod extends Thread
{
    public void run()
    {
        try
        {
        Thread.sleep(300);
            System.out.println("is run() method isAlive "+Thread.currentThread().isAlive());
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
    public static void main(String[]args)
    {
        IsAliveMethod t1=new IsAliveMethod();
        System.out.println("Before starting thread isAlive:"+t1.isAlive());
        t1.start();
        System.out.println("After starting thread isAlive:"+t1.isAlive());
    }
}




