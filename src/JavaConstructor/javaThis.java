package JavaConstructor;

/**
 * Created by i net on 10/08/2017.
 */
public class javaThis
{
    int a,b;
    String c;
    javaThis()
    {
        System.out.println("It's default constructor");
    }
    javaThis(int a,int b,String c)
    {
        this();
        this.a=a;
        this.b=b;
        this.c=c;

    }
    void display()
    {
        System.out.println("a : "+a+"\nb : "+b+"\nc : "+c);
    }
    void add()
    {
        a=10;
        b=10;
        System.out.println("Addition = "+(a+b));
    }
    void disp()

    {
        add();
    }
    public static void main(String[] args)
    {
        javaThis j=new javaThis(1,2,"Pooja");
        j.display();
        j.disp();

    }
}
