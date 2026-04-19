class bus implements Runnable
{
    int available=2,pass;
    String name;
    bus(int pass)
    {
        this.pass=pass;
    }
    public synchronized void run()
    {   
                  name=Thread.currentThread().getName();
            if(available>=pass)
            {
                System.out.println(name+" has got the seat");
                available=available-1;
            }
            else{
                System.out.println(name+" has not got the seat in the bus");
            }
        
    }
}
public class synchronization
{
    public static void main(String[] args) {
        bus obj=new bus(1);
        Thread t1=new Thread(obj);   
        Thread t2=new Thread(obj);   
        Thread t3=new Thread(obj);
        Thread t4=new Thread(obj);
        t1.setName("althaf");
        t2.setName("Afreen");
        t3.setName("Anifa");
        t4.setName("Hasan");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}