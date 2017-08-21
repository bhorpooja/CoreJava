package JavaWrapperClass;

/**
 * Created by i net on 16/08/2017.
 */
public class typeCast {
    void Implicit()
    {
        int i=100;
        float f=i;
        System.out.println(f);
    }
    void Explicit()
    {
        double d=200.04;
        int f= (int) d;
        System.out.println(f);
    }

    public static void main(String[] args) {
        typeCast t=new typeCast();
        t.Implicit();
        t.Explicit();
    }
}
