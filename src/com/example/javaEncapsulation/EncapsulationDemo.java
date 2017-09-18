package com.example.javaEncapsulation;

/**
 * Created by i net on 16/08/2017.
 */
public class EncapsulationDemo {
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    String name;
    String city;
}
class Test{
    EncapsulationDemo e=new EncapsulationDemo();
    EncapsulationDemo showData()
    {
        e.setId(1);
        e.setName("Pooja");
        e.setCity("Pune");
        return  e;
    }

    public static void main(String[] args) {
        //encapsulationDemo e2=new encapsulationDemo();
        Test t=new Test();
        EncapsulationDemo e2=t.showData();
        System.out.println(e2.getId());
        System.out.println(e2.getName());
        System.out.println(e2.getCity());
    }
}
