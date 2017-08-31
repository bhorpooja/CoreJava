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
                    System.out.println(m.getKey()+" "+st.getRoll_no()+" "+st.getName()+" "+st.getCity());
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

            System.out.println("\n Iterating list of mapOfobject");
            for (Map<String,Students> m:list) {
                for (Map.Entry<String,Students> w:m.entrySet()) {
                   // String key=w.getKey();
                    Students a=w.getValue();
                    System.out.println(w.getKey()+" "+a.getRoll_no()+" "+a.getName()+" "+a.getCity());

                    //System.out.println(w.getKey()+" "+w.getValue());
                }


            }
        }
        void mapAdd(){
            Map<Integer,String> map2=new HashMap<>();
            map2.put(11,"A");
            map2.put(12,"B");
            map2.put(13,"C");
            System.out.print("MAP2 : ");
            System.out.println(map2);
//            for (Map.Entry e:map2.entrySet()){
//                System.out.println(e.getKey()+" "+e.getValue());
//            }

            Map<Integer,String> map3=new HashMap<>();
            map3.put(14,"D");
            map3.put(15,"E");
            System.out.print("MAP3 : ");
            System.out.println(map3);
//            for (Map.Entry e:map3.entrySet()) {
//                System.out.println(e.getKey()+" "+e.getValue());
//            }
            System.out.println("put one map to another map");
            map2.putAll(map3);
            for (Map.Entry e:map2.entrySet()) {
                System.out.println(e.getKey()+" "+e.getValue());
            }

            System.out.println("checking num of key-value mapping");
            System.out.println(map2.size());

            System.out.println("checking whether map is empty or not");
            System.out.println(map2.isEmpty());

            System.out.println("checking map contain mapping of specified key");
            System.out.println(map2.containsKey(10));

            System.out.println("checking is map contain mapping to specified value");
            System.out.println(map2.containsValue("D"));

            System.out.println("getting value to which specified key is mapped");
            System.out.println(map2.get(12));

            System.out.println("getting view of key contained in map");
            System.out.println(map2.keySet());

            System.out.println("getting view of values contained in map");
            System.out.println(map2.values());

            System.out.println("Map.Entry subInterface Methods");
            System.out.println("getKey() and getValue() and setValue(value)");
            for(Map.Entry e:map2.entrySet()) {
                System.out.println(e.getKey() + " " + e.getValue());
                //System.out.println(e.setValue("Hii"));
            }
            System.out.println(map2);
            System.out.println("Replacing the value of specified key only if it is currently mapped to some value.");
            map3.replace(14,"Hii");
            System.out.println(map3);

            map2.replace(11,"A","Hii");
            System.out.println(map2);

            System.out.println("Map Equality Method");
            System.out.println("check given key having specified value");
            System.out.println(map2.get(11).equals("A"));
            System.out.println(map2.get(11).equalsIgnoreCase("hii"));
            System.out.println("check equality between two map entry");
            System.out.println(map2.get(11).equals(map3.get(14)));

            System.out.println("getting the hash code value of map entry");
            System.out.println(map2.hashCode());
            System.out.println("remove map entry");
//            map2.remove(11,"Hii");
//            System.out.println(map2);

            map2.replace(11,"Hii","");
            System.out.println(map2);
            map2.computeIfAbsent(map2.get(11),map2.)
        }
    public static void main(String[] args) {
        javaMapDemo m=new javaMapDemo();
 //       m.javaMap();
//        m.MapDemo();
 //       m.listDemo();
        m.mapAdd();
    }
}
