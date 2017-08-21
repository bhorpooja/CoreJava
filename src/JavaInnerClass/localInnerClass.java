package JavaInnerClass;

/**
 * Created by i net on 15/08/2017.
 */
public class localInnerClass {
    private String name="Java Inner class";
    void display()
    {
        int data=30;
        class inner {
            void show() {
                System.out.println(name+" "+data);
                System.out.println("In Local Inner Class ");
            }
        }
        inner i=new inner();
        i.show();


    }

    public static void main(String[] args) {
        localInnerClass l=new localInnerClass();
        l.display();
    }
}
