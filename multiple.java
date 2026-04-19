interface a
{
    void getacademicmarks();
}
interface b
{
    void getsportsmarks();
}
class C implements a,b
{
 int academicmarks=65;
 int sportsmarks=67;
 public void getacademicmarks()
 {
    System.out.println("the academic marks are:"+academicmarks);
 }
 public void getsportsmarks()
 {
    System.out.println("the sports marks are:"+sportsmarks);
 }
 public void total()
 {
    System.out.println("the total marks are"+(academicmarks+sportsmarks));
 }
}
public class multiple {
    public static void main(String args[])
    {
        C obj=new C();
        obj.getacademicmarks();
        obj.getsportsmarks();
        obj.total();
    }
}
