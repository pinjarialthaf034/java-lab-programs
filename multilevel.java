class x
{
    int a=20;
    public void showa()
    {
        System.out.println("value of a:"+a);
    }
}
class y extends x
{
    int b=30;
    public void showb()
    {
        System.out.println("value of the b:"+b);
        System.out.println("addition of a and b:"+(a+b));
    }
}
class z extends y
{
    int c=30;
    public void showc()
    {
        System.out.println("value of the c:"+c);
        System.out.println("addition of three is:"+(a+b+c));
    }
}
public class multilevel {
    public static void main(String args[])
    {
        z obj=new z();
        obj.showa();
        obj.showb();
        obj.showc();
        obj.showc();
        
    }
}
