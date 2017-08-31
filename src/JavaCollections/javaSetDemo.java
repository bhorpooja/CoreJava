package JavaCollections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by pooja on 30/8/17.
 */
class SetDemo{
    void setAdd(){
        System.out.print("SET1 : ");
        Set<Integer> set1=new HashSet<>();
        set1.add(1);
        set1.add(1);
        set1.add(3);
        set1.add(4);
        set1.add(2);
        System.out.println(set1);
        System.out.print("SET2 : ");
        Set<Integer> set2=new TreeSet<>();
        set2.add(1);
        set2.add(4);
        set2.add(3);
        set2.add(5);
        System.out.println(set2);
        System.out.println("adding set2 to set1");
        set1.addAll(set2);
        System.out.println(set1);


//        Set set3=new TreeSet();
//        set3.add(1);
//        set3.add("a");
//        set3.add(2);
//        set3.add("b");
//        System.out.println(set3);

        Set set4=new HashSet();
        set4.add(1);
        set4.add("a");
        set4.add(2);
        set4.add("b");
        set4.add(3);
        set4.add(null);
        System.out.println(set4);

        System.out.println(set1.contains(1));
        System.out.println(set1.containsAll(set4));
        System.out.println(set1.containsAll(set2));
        System.out.println(set1.equals(set2));
        System.out.println(set2.equals(set1));

        System.out.println(set1.iterator());
        System.out.println(set1.remove(1));
        System.out.println(set1);
        System.out.println(set1.removeAll(set2));
        System.out.println(set1);
        }
}
public class javaSetDemo {
    public static void main(String[] args) {
        SetDemo s=new SetDemo();
        s.setAdd();
    }
}
