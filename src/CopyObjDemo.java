/**
 * Created by pooja on 18/9/17.
 */
public class CopyObjDemo implements Cloneable{
    @Override
    public String toString() {
        return "Demo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    int id;
    String name;
    CopyObjDemo(int id,String name){
        this.id=id;
        this.name=name;
    }
    public  Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class ObjectCopy{
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("copy one obj to another");
        System.out.println("1-using shallow method");
        CopyObjDemo d=new CopyObjDemo(10,"Pooja");
        System.out.println(d);
        CopyObjDemo d1= d;
        System.out.println(d);
        d1.id=20;
        System.out.println(d);
        System.out.println(d1);
        System.out.println("\n2-using Deep method");
        CopyObjDemo d2=new CopyObjDemo(30,"Ashish");
//        d2.id=d1.id;
//        d2.name=d1.name;
//        d2.id=30;
        System.out.println(d1);
        System.out.println(d2);
        System.out.println("\n3-using clone method");
        CopyObjDemo d3=new CopyObjDemo(40,"Rani");
        CopyObjDemo d4=(CopyObjDemo) d3.clone();
        System.out.println(d3);
        System.out.println(d4);

    }
}
