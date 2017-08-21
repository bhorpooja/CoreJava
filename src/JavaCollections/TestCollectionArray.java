package JavaCollections;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by i net on 18/08/2017.
 */
class Student{
    int id;
    String name;
    String clg;
    Student(int id,String name,String clg){
        this.id=id;
        this.name=name;
        this.clg=clg;
    }
}
public class TestCollectionArray {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Pooja", "SVCET");
        Student s2 = new Student(2, "Rajan", "COEP");
        Student s3 = new Student(3, "Vaibhav", "GPP");
        Student s4 = new Student(4, "Rohan", "PCCOE");
        ArrayList<Student> stud = new ArrayList<Student>();
        stud.add(s1);
        stud.add(s2);
        stud.add(s3);
        stud.add(s4);
        Iterator    i=stud.iterator();
        while (i.hasNext()){
            Student s=(Student)i.next();
            System.out.println("ID = "+s.id+" Name = "+s.name+" College = "+s.clg);
        }
        System.out.println();
    }
}
