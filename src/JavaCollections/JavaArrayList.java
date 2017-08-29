package JavaCollections;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by i net on 17/08/2017.///
 */
class JavaArrayDemo {
    List<Integer> list = new ArrayList<Integer>();
    ArrayList<Integer> list1 = new ArrayList<Integer>();

    void add() {

        System.out.println("add element sequentially..");
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("List : " + list);
        System.out.println("add element to specified index..");
        list.add(1, 11);
        System.out.println(list);
        System.out.println("adding one list to another");
        list1.add(30);
        list1.add(40);
        list1.add(50);
        System.out.println("List1 : " + list1);
        list.addAll(list1);
        System.out.println(list);

    }

    void removeElement() {
        System.out.println("remove element of specified index from list");
        list.remove(3);
        System.out.println(list);
//        System.out.println("remove all elements of specified list from List");
//        list.removeAll(list1);
//        System.out.println(list);
        System.out.println("removes list all elements that are not contained in the specified collection.");
        list.retainAll(list1);
        System.out.println(list);
        System.out.println(list1);

    }
}

public class JavaArrayList {
    public static void main(String[] args) {
        JavaArrayDemo javaArrayDemo = new JavaArrayDemo();
        javaArrayDemo.add();
        javaArrayDemo.removeElement();
    }
}
