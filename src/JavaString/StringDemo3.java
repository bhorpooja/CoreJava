package JavaString;

/**
 * Created by i net on 17/08/2017.
 */
public class StringDemo3 {
    void show(){
        System.out.println("String Comparision : == and .equals");
        String s1="Pooja";
        String s2="Pooja";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        String s3="Bhor";
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
        String s4=new String("Pooja");
        System.out.println(s1==s4);
        System.out.println(s1.equals(s4));
        System.out.println("String equalIgnoreCase");
        String s5="Pooja";
        String s6="pOOJA";
        System.out.println(s5.equals(s6));
        System.out.println(s5.equalsIgnoreCase(s6));
    }
    public static void main(String[] args) {
       StringDemo3 s=new StringDemo3();
       s.show();
    }
}
