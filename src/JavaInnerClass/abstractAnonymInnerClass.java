package JavaInnerClass;

/**
 * Created by i net on 15/08/2017.
 */
abstract class Inner {
    String name= "Pooja";
    int a=10;
    abstract void display();

    void show(){
        System.out.println("hhhhhhhhhhhhhhhhhhhhh");
    };
}

public class abstractAnonymInnerClass {

    public static void main(String[] args) {
        System.out.println("In abstract or concrete anonymous inner class");

        Inner i = new Inner() {
            @Override
            void display() {
                System.out.println("In abstract method "+name+" "+a);

            }

            @Override
            void show() {
                super.show();
                System.out.println("In concrete method");
            }
        };
        i.display();
        i.show();
    }

}
