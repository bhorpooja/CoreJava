package JavaCollections;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by pooja on 30/8/17.
 */
class SetDemo{
    void setAdd(){
        System.out.print("SET1 : ");
        Set<Integer> set1=new HashSet<>();
        set1.add(1);
        set1.add(1);
        System.out.println(set1);
        System.out.print("SET2 : ");
        Set<Integer> set2=new HashSet<>();
        set2.add(3);
        set2.add(4);
        System.out.println(set2);
        System.out.println("adding set2 to set1");
        set1.addAll(set2);
        System.out.println(set1);
        }
}
public class javaSetDemo {
    public static void main(String[] args) {
        SetDemo s=new SetDemo();
        s.setAdd();
    }
}
