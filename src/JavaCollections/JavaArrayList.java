package JavaCollections;

import java.util.ArrayList;

/**
 * Created by i net on 17/08/2017.///
 */
public class JavaArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(1,11);
        System.out.println(list);
        ArrayList<Integer> list1=new ArrayList<Integer>();
        list1.add(30);
        list1.add(40);
        list1.add(50);
        System.out.println(list1);
        list.addAll(list1);
        System.out.println(list);
        list.removeAll(list1);
        System.out.println(list);
//        list1.removeAll(list);
//        System.out.println(list1);
//       list.contains(  list1 );
//        System.out.println(list1);
// print list
    }
}
