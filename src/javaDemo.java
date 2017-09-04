import java.util.ArrayList;
import java.util.List;

/**
 * Created by pooja on 4/9/17.
 */
public class javaDemo {
    List<Student> setData(){
        List<Student> list=new ArrayList<>();
        Student s=new Student();
        s.setId(1);
        s.setName("pooja");
        s.setAddress("Pune");

        Student ss=new Student();
        ss.setId(2);
        ss.setName("rohan");
        ss.setAddress("pune");
        list.add(s);
        list.add(ss);
        return list;

    }
    void getData(){
       List<Student> s1=setData();
       // System.out.println(s1.getId()+" "+s1.getName()+" "+s1.getAddress());
        //return s1;
        for(Student s:s1){
            System.out.println(s.getId()+" "+s.getName()+" "+s.getAddress());

        }
        s1.forEach(s-> System.out.println(s.getId()+" "+s.getName()+" "+s.getAddress()));
    }

    public static void main(String[] args) {
        javaDemo j=new javaDemo();
        j.getData();
    }
}
