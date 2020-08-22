public class JoinMethod extends Thread 
{
    public void run()
    {
        try
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println(i);
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
    public static void main(String[]args) throws Exception
    {
        JoinMethod t1=new JoinMethod();
        JoinMethod t2=new JoinMethod();
        JoinMethod t3=new JoinMethod();   
        t1.start();
        t1.join();
        t2.start();
        t3.start();
    }
}
