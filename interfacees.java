interface a
{
    void show();

}
interface b
{
    void display();
}
class C implements a,b{
    public void show()
    {
        System.out.println("this is from the interface a");
    }
    public void display()
    {
        System.out.println("this is from the interface b");
    }
}
public class interfacees {
    public static void main(String args[])
    {
        C obj=new C();
        obj.show();
        obj.display();
    }
}
