/**
 * Created by pooja on 18/9/17.
 */
public class CopyObjDemo {
    @Override
    public String toString() {
        return "Demo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    int id;
    String name;
}
class ObjectCopy{
    public static void main(String[] args) {
        System.out.println("copy one obj to another");
        System.out.println("1-using shallow method");
        CopyObjDemo d=new CopyObjDemo();
        d.id=10;
        d.name="Pooja";
        System.out.println(d);
        CopyObjDemo d1=d;
        //System.out.println(d);
        d1.id=20;
        System.out.println(d);
        System.out.println(d1);
        System.out.println("\n2-using Deep method");
        CopyObjDemo d2=new CopyObjDemo();
        d2.id=d1.id;
        d2.name=d1.name;
        d2.id=30;
        System.out.println(d1);
        System.out.println(d2);


    }
}
