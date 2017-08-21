package JavaInheritance;

/**
 * Created by pooja on 21/8/17.
 */
class parent{
     void show(){
        System.out.println("In parent class method");
    }
}
class Child extends parent{
    Child()
    {
       super.show();
    }
    void show(){
        System.out.println("In child class method");
    }
}
public class javaOverriding {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
        parent p=new parent();
        p.show();


    }
}
