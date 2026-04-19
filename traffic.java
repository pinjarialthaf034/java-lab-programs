class signal implements Runnable 
{
    String color;
    int time;
    signal(String color,int time)
    {
        this.color=color;
        this.time=time;
    }
    public void run()
    {
         try{
            
            System.out.println(color+" LIGHT IS ON");
            Thread.sleep(time);
            }
         
         catch(InterruptedException e)
         {
            System.out.println(e);
         }
        }
    }
    
public class traffic{
    public static void main(String args[]) throws InterruptedException
    {
        signal obj=new signal("RED", 3000);
        signal obj1=new signal("ORANGE", 3000);
        signal obj2=new signal("GREEN", 3000);
        for(int i=0;i<5;i++)
            {
        Thread t1=new Thread(obj);
          t1.start(); 
          t1.join();
        Thread t2=new Thread(obj1); 
         t2.start();  
         t2.join();
        Thread t3=new Thread(obj2);      
        t3.start();  
        t3.join();
            }
    }
}

