public class SleepMethod extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)                     
        {                                        // try
            try                                  //{
            {                                    //for(int i=0;i<5;i++)
                Thread.sleep(1000);              //{
            }                                    //   System.out.println(i);
            catch(InterruptedException e)        //   Thread.sleep(1000);
            {                                    // }
                System.out.println(e);           //}
            }                                    //catch(InterruptedException e)
            System.out.println(i);               //{
        }                                        //    System.out.println(e);
    }                                            //}
        public static void main(String[]args)
        {
            SleepMethod t1=new SleepMethod();
            SleepMethod t2=new SleepMethod();
            t1.start();
            t2.start();
        }
}

 
