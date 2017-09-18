package com.example.javaCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by pooja on 29/8/17.
 */
class ObjectsGrouping {

    List<Students> getData() {
        List<Students> list = new ArrayList<Students>();
        Students s1 = new Students();
        s1.setRoll_no(1);
        s1.setName("Pooja");
        s1.setCity("Pune");

        Students s2 = new Students();
        s2.setRoll_no(2);
        s2.setName("Ashish");
        s2.setCity("Chakan");

        Students s3 = new Students();
        s3.setRoll_no(3);
        s3.setName("Ram");
        s3.setCity("Mumbai");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        return list;
    }

        void printData()
        {
            List<Students> list1=getData();
        System.out.println("Printing List");
        // System.out.println(list);

        System.out.println("Using for loop");
        for (Students s : list1) {
            System.out.println(s.getRoll_no()+" "+s.getName()+" "+s.getCity());

        }

        System.out.println("Using Iterator");
        Iterator i = list1.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        }

    }

public class ObjectListDemo {
    public static void main(String[] args) {
        ObjectsGrouping og=new ObjectsGrouping();
        og.printData();
    }

}
