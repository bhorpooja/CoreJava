package com.example.javaInnerClass;

/**
 * Created by i net on 15/08/2017.
 */
interface Inner1{
    String name="Pooja";

    void show();
}
public class interfaceAnonymInnerClass {
    public static void main(String[] args) {

        Inner1 i= new Inner1() {

            @Override
            public void show()
            {
                System.out.println("Interface Anonymous Inner Class "+name);
            }
        };
        i.show();
    }

}
