package my_package;
public class mathoper
{
    public void rev(int num)
    {
        int digit;
        int rev=0;
        while(num>0)
        {
            digit=num%10;
            rev=(rev*10)+digit;
            num=num/10;
        }
        System.out.println("reverse of the number is:"+rev);
    }
}