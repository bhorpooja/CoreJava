package JavaCollections;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pooja on 29/8/17.
 */
class listDemo{
    int id;
    String name;
    String clg;

    @Override
    public String toString() {
        return "listDemo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", clg='" + clg + '\'' +
                '}';
    }

    listDemo(int id,String name,String clg){
        this.id=id;
        this.name=name;
        this.clg=clg;
    }

 }
public class JavaList {
    public static void main(String[] args) {

            List<listDemo> list = new ArrayList<listDemo>();
            listDemo l1 = new listDemo(1, "Pooja", "SVCET");
            listDemo l2 = new listDemo(2, "Suhani", "COEP");
            list.add(l1);
            list.add(l2);
        for (listDemo l:list) {
            System.out.println(list);
        }
        }
    }