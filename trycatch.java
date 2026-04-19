public class trycatch {
    public static void main(String args[])
    {
        int a=10;
        int b=0;
        int c[]={1,2,3};
        try
        {
            System.out.println("division of two numbers is"+(a/b));
                System.out.println("value of the array at the index of 5:"+c[5]);
                System.out.println("array index is out of bounds!!");
            
        }
        catch(ArithmeticException e)
        {
            System.out.println("error!! Divide By Zero");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }    
}
