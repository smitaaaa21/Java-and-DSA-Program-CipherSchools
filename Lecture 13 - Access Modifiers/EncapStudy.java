class Demo
{
    private int a = 5;
    private int b = 10;

    
    public int getA()
    {
        System.out.println("Value of A read");
        return this.a;
    }
    public int getB()
    {
        System.out.println("Value of A read");
        return this.b;
    }

     public void setA(int a)
     {
         if(a>100)
         {
             this.a = a;
             System.out.println("Value of A changed to: "+a);
         }
         else
         {
             System.out.println("Cannot set -value outside limits");
         }
     }
     public void setB(int b)
     {
         this.b = b;
     }
}

public class EncapStudy
{
    public static void main(String[] args)
    {
        Demo d = new Demo();
//      System.out.println(d.a);
        System.out.println(d.getA());
        d.setA(100);
        System.out.println(d.getA());
    } 
}