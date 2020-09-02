class Deadlock extends Thread
{
    static Thread mt=null;
    public void run()
    {
        System.out.println("run= "+Thread.currentThread().getName());
        {
        try
        {
        mt.join();
        }
        catch(Exception e)
        {
           e.printStackTrace();
        }
        try
            {
                for(int i=1;i<=10;i++)
                {
                     System.out.println("run= "+Thread.currentThread().getName());
                     Thread.sleep(500);
                }
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[]args) throws InterruptedException
    {
        System.out.println("Main= "+Thread.currentThread().getName());
        Deadlock t=new Deadlock();
        t.setName("NIT");
        mt=Thread.currentThread();//main thread ka object banta hai aise
        t.start();
        t.join();
        try
            {
                for(int i=1;i<=10;i++)
                {
                     System.out.println("Main= "+Thread.currentThread().getName());
                     Thread.sleep(500);
                }
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
    }
}
        
         
                   
