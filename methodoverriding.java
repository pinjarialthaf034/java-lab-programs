class x
{
     public void method(int num1,int num2)
    {
        System.out.println("the addition of two numbers are:"+(num1+num2));
    }
}
class y extends x
{
    public void method(int num1,int num2)
    {   super.method(num1, num2);
        System.out.println("the addition of two numbers is:"+(num1+num2+10));
    }
}
class z extends y{
    public void method(int num1,int num2)
    {   super.method(num1, num2);
        System.out.println("the addition of two numbers and 20 is:"+(num1+num2+20));
    }
}
public class methodoverriding{
    public static void main(String args[])
    {
        x obj=new z();
        obj.method(10,20);
    }
}

