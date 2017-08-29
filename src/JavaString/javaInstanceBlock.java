package JavaString;

/**
 * Created by pooja on 29/8/17.
 */
class A{
    A(){
        System.out.println("in A constructor");
    }
    {
        System.out.println("A instance Block");
    }
}
class B extends A{
    B(){
        System.out.println("in B constructor");
    }
    {
        System.out.println("in B instance Block");
    }
}
public class javaInstanceBlock {
    public static void main(String[] args) {
        B b = new B();
    }
}
