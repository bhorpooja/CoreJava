package JavaCollections;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by i net on 17/08/2017.///
 */
class JavaArrayDemo {
    List<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<Integer>();

    void add() {

        System.out.println("add element sequentially..");
        list1.add(10);
        list1.add(20);
        list1.add(30);
        System.out.println("List1  " + list1);
        System.out.println("add element to specified index..");
        list1.add(1, 11);
        System.out.println(list1);
        System.out.println("adding one list to another at end of list");
        list2.add(30);
        list2.add(40);
        list2.add(50);
        System.out.println("List2 : " + list2);
        list1.addAll(list2);
        System.out.println(list1);
        System.out.println("adding one list to another from specified index");
        list1.addAll(2,list2);
        System.out.println(list1);
        list1.set(6,60);
        System.out.println(list1);

    }

    void removeElement() {
        System.out.println("LIST1 :"+list1);
        System.out.println("LIST2 :"+list2);
        System.out.println("remove element of specified index from list");
        list1.remove(1);
        System.out.println(list1);

        System.out.println("removes list all elements that are not contained in the specified collection.");
        list1.retainAll(list2);
        System.out.println(list1);

        System.out.println("removes list all elements that are contained in the specified collection.");
        list1.removeAll(list2);
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
