package JavaInnerClass;

/**
 * Created by i net on 14/08/2017.
 */
public class memberInnerClass
{

    String name="Pooja";
    class Name{
        void show()
        {
            System.out.println("It is memberInnerClass");
            System.out.println("My name is "+name);
        }
        void show1()
        {
            System.out.println("In inner Class method");
        }
    }
    void display(){
        System.out.println("In outer class method");
    }

    public static void main(String[] args) {
        memberInnerClass m=new memberInnerClass();
        m.display();
        Name n=m.new Name();
        n.show();
        n.show1();




    }
}
