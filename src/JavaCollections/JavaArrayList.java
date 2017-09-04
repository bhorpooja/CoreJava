package JavaCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by i net on 17/08/2017.///
 */
class JavaArrayDemo {
    List<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<Integer>();

    void addArrayList() {

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
        System.out.println("replacing specified position element of list to specified element");
        list1.set(6,60);
        System.out.println(list1);


    }
    void getArrayList(){
        System.out.println("getting specified position element from list");
        System.out.println(list1.get(7));
        System.out.println("getting the fist occurrence of specified element of list");
        System.out.println(list1.indexOf(30));
        System.out.println("getting the last occurrence of specified element of list");
        System.out.println(list1.lastIndexOf(30));
        System.out.println("getting listIterator over the element in this list");
        ListIterator l=list1.listIterator(3);
        System.out.println(l);
        System.out.println("getting the view of list between specified index");
        System.out.println(list1.subList(2,4));
        System.out.println("getting the hash code value of list");
        System.out.println(list1.hashCode());
        System.out.println("compare specified object with list");
        System.out.println(list1.equals(list2));
        System.out.println("getting whether specified element is within list or not");
        System.out.println(list1.contains(30));
        System.out.println("getting that whether list is empty or not");
        System.out.println(list1.isEmpty());
        System.out.println(list2.clone());

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
        javaArrayDemo.addArrayList();
        javaArrayDemo.getArrayList();
        javaArrayDemo.removeElement();
    }
}
