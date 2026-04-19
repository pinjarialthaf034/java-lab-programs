public class Constructor
{
    Constructor()
    {
        System.out.println("hello this constructor");

    }
    Constructor(int num)
    {
        System.out.println("the number in the constructior is:"+num);
    }
    Constructor(int num,int num2)
    {
        System.out.println("the addition of two number is :"+(num+num2));
    }
    Constructor(int num1,float num2)
    {
        System.out.println("addition of int and float is:"+(num1+num2));
    }
    public static void main(String args[])
    {
        Constructor obj=new constructor();
        Constructor obj1=new constructor(121);
        Constructor obj2=new constructor(121,123);
        Constructor obj3=new constructor(121,123.67f);
    }
}