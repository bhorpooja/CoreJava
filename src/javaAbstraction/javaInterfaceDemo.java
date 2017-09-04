package javaAbstraction;

/**
 * Created by pooja on 31/8/17.
 */
interface Test1{
    void show();
}
interface Test2{
    void show();
    void disp();
}
public abstract class javaInterfaceDemo implements Test1,Test2{

        abstract void get();
        @Override
        public void show () {
            System.out.println("Multiple interface through interface");
        }

        @Override
        public void disp () {
            System.out.println("Test2 Interface Method");

    }

}
class Check{
    public static void main(String[] args) {
        javaInterfaceDemo j=new javaInterfaceDemo() {
            @Override
            void get() {
                System.out.println("Abstract Method");
            }

        };
        j.show();
        j.disp();
        j.get();
    }
}
