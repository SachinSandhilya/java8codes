package session3;

// Top-level class to implement the Functional-interface i.e. Runnable
class MyRunnable implements Runnable
{

    @Override
    public void run() 
    {
      for(int i=0; i<10; i++)
      {
        System.out.println("Child Thread");
      }
    }

}

public class Test
{
    public static void main(String[] args)
    {
        MyRunnable mr= new MyRunnable();
        Thread t =new Thread(mr);
        t.start();

        for(int i=0; i<10; i++)
        {
            System.out.println("Parent Thread");
        }
    }
}
