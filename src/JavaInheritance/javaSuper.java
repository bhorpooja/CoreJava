package JavaInheritance;

/**
 * Created by pooja on 21/8/17.
 */
class Parent {
     static int a=10;
    Parent(){
        System.out.println("in parent constructor");
    }
    static void disp(){
        System.out.println("It's parent method");
    }


}
class Parent1 extends Parent
{
  int a=20;
  Parent1()
  {
      System.out.println("in parent1 constructor ");
      System.out.println(a);
      System.out.println(super.a);
  }
  void disp1(){
      disp();
      System.out.println("It's parent1 method");
  }

//    public static void main(String[] args) {
//      Parent1 p=new Parent1();
//        p.disp1();
//    }
}

public class javaSuper extends Parent1 {

    int a=30;
    void show()
    {
        disp1();
        System.out.println(a);
        System.out.println(super.a);
        System.out.println(Parent.a);

    }
    public static void main(String[] args) {
        javaSuper j=new javaSuper();
        j.show();
        Parent.disp();
    }

    public static void main(String args) {
        System.out.println("hello hiiii");

    }
}
