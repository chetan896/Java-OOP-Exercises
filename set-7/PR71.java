public class PR71
{
    public static void main(String[] args) 
    {
        Thread t1 = new Thread(new First());
        Thread t2 = new Thread(new Second());

        t1.start();
        t2.start();
    }
}

class First implements Runnable
{
    public void run()
    {
        for (int i = 1; i <= 10; i++)
        {
            System.out.println("T1: "+ i);
            try
            {
                Thread.sleep(1000);
            }
            catch (Exception e)
            {
            }
        }
    }
}

class Second implements Runnable
{
    public void run()
    {
        for (int i = 11; i <= 20; i++)
        {
            System.out.println("T2: "+ i);
            try
            {
                Thread.sleep(500);
            }
            catch (Exception e)
            {
            }
        }
    }
}