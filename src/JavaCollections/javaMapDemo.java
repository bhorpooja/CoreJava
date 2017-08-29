package JavaCollections;

import java.util.*;

/**
 * Created by pooja on 29/8/17.
 */
public class javaMapDemo {
       void javaMap()
       {
           Map<String,Object> mm=new HashMap<>();
           Students st=new Students();
           st.setRoll_no(4);
           st.setName("Omkar");
           st.setCity("Ale");
           mm.put("100",st);
           System.out.println(mm);
       }
        void MapDemo(){
            Map<String,List<Students>> map=new HashMap<>();
            Students s=new Students();
            List<Students> l=new ArrayList<>();
            s.setRoll_no(5);
            s.setName("Vaibhav");
            s.setCity("Satara");
            l.add(s);

            Students ss=new Students();
            ss.setRoll_no(6);
            ss.setName("Ram");
            ss.setCity("Pune");
            l.add(ss);
            map.put("101",l);
            System.out.println(map);
        }
        void listDemo(){
            List<Map<String, Students>> list=new ArrayList<>();
            Students s1=new Students();
            Map<String,Students> map1=new HashMap<>();
            s1.setRoll_no(7);
            s1.setName("Raj");
            s1.setCity("Mumbai");
            map1.put("102",s1);
            list.add(map1);

            Students s2=new Students();
            Map<String,Students> map2=new HashMap<>();
            s2.setRoll_no(8);
            s2.setName("Ravi");
            s2.setCity("Junnar");
            map1.put("103",s2);
            //System.out.println(list);
            Iterator i=list.iterator();
            while (i.hasNext())
            {
                System.out.println(i.next());
            }
        }
    public static void main(String[] args) {
        javaMapDemo m=new javaMapDemo();
        m.javaMap();
        m.MapDemo();
        m.listDemo();
    }
}
