package JavaCollections;

import java.util.*;


/**
 * Created by pooja on 29/8/17.
 */
public class javaMapDemo {
       void javaMap()
       {
           Map<String,String> m1=new HashMap<>();
           m1.put("11","Java");
           m1.put("12","Android");
           m1.put("13","Spring");
          for (Map.Entry m:m1.entrySet())
          {
           System.out.println(m.getKey()+" "+m.getValue());
          }

           Map<String,Object> m2=new HashMap<>();
           Students st=new Students();
           st.setRoll_no(4);
           st.setName("Omkar");
           st.setCity("Ale");
           m2.put("100",st);
           for (Map.Entry m:m2.entrySet()){
               System.out.println(m.getKey()+" "+m.getValue());
           }
       }
        void MapDemo(){
            Map<String, List<Students>> map=new HashMap<>();
            List<Students> l=new ArrayList<>();

            Students s=new Students();
            s.setRoll_no(5);
            s.setName("Vaibhav");
            s.setCity("Satara");

            Students ss=new Students();
            ss.setRoll_no(6);
            ss.setName("Ram");
            ss.setCity("Pune");

            l.add(s);
            l.add(ss);

            map.put("101",l);

            System.out.println("Iterating map of listOfobjects : ");
            for (Map.Entry<String, List<Students>> m:map.entrySet())
            {
                List<Students> sss=m.getValue();
                for (Students st:sss){
                    System.out.println(st.getRoll_no()+" "+st.getName()+" "+st.getCity());
                }
            }
       }
        void listDemo(){
            List<Map<String, Students>> list=new ArrayList<>();
            Map<String,Students> map1=new HashMap<>();
            Students s1=new Students();
            s1.setRoll_no(7);
            s1.setName("Raj");
            s1.setCity("Mumbai");

            Students s2=new Students();
            //Map<String,Students> map2=new HashMap<>();
            s2.setRoll_no(8);
            s2.setName("Ravi");
            s2.setCity("Junnar");

            map1.put("102",s1);
            map1.put("103",s2);

            list.add(map1);

            System.out.println("Iterating list of mapOfobject");
            for (Map<String,Students> m:list) {
                for (Map.Entry<String,Students> w:m.entrySet()) {
                    System.out.println(w.getKey()+" "+w.getValue());
                }


            }
        }
//        void mapAdd(){
//            Map<Integer,String> map2=new HashMap<>();
//            map2.put(11,"A");
//            map2.put(12,"B");
//            map2.put(13,"C");
//            System.out.println(map2);
//            for (Map.Entry e:map2.entrySet()){
//                System.out.println(e.getKey()+" "+e.getValue());
//            }
//
//            Map<Integer,String> map3=new HashMap<>();
//
//
//        }
    public static void main(String[] args) {
        javaMapDemo m=new javaMapDemo();
//        m.javaMap();
        m.MapDemo();
        m.listDemo();
//        m.mapAdd();
    }
}
