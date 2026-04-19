public class methodloading {
   public void multiplication(int num)
    {
        System.out.println("hello the number is :"+num);
    }
    public void multiplication(int num1,int num2)
    {
        System.out.println("multiplication of two numbers is :"+(num1*num2));
    }
    public void multiplication(int num1,float num2)
    {
        System.out.println("multiplication int and float is :"+(num1*num2));
    }
    public static void main(String args[])
    {
        methodloading obj=new methodloading();
        obj.multiplication(123);
        obj.multiplication(12, 3.4f);
        obj.multiplication(12, 12);
    }
}
