package my_package;
public class palindrome {
    public void ispalin(int num)
    {
        int digit;
        int org=num;
        int rev=0;
        while(num>0)
        {
            digit=num%10;
            rev=(rev*10)+digit;
            num=num/10;
        }
        if(org==rev)
        {
            System.out.println("given number is palindrome number BRUHH!!");
        }
        else{
            System.out.println("Given number is not a palindrome number");
        }
    }
}
