package JavaCollections;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by i net on 18/08/2017.
 */
class Student{
    int id;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", clg='" + clg + '\'' +
                '}';
    }

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
        ArrayList<Student> stud = new ArrayList<Student>();
        Student s1 =new  Student(1, "Pooja", "SVCET");
        stud.add(s1);
        Student s2 = new Student(2, "Rajan", "COEP");
        stud.add(s2);
//        Student s3 = new Student(3, "Vaibhav", "GPP");
//        stud.add(s3);
//        Student s4 = new Student(4, "Rohan", "PCCOE");
//        stud.add(s4);




        Iterator i=stud.iterator();
        while (i.hasNext()){
            Student s=(Student)i.next();
            System.out.println("ID = "+s.id+" Name = "+s.name+" College = "+s.clg);
        }
        System.out.println();
        for (Student s:stud) {
           // System.out.println("ID = "+s.id+" Name = "+s.name+" College = "+s.clg);
            System.out.println(stud);
        }
    }
}
