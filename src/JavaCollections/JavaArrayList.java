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
        list.remove(4);
        System.out.println(list);
        int size=list.size();
//      list1.removeAll(list);
        System.out.println(size);
         boolean num=list.contains( 30 );
        System.out.println(num);
        int n=list.hashCode();
        System.out.println(n);
// print list
    }
}
