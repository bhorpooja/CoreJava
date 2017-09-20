import java.io.*;

/**
 * Created by pooja on 19/9/17.
 */
public class SerializableExample implements Serializable{

//    @Override
//    public String toString() {
//        return "SerializableExample{" +
//                "uname='" + uname + '\'' +
//                ", pass='" + pass + '\'' +
//                '}';
//    }

    @Override
    public String toString() {
        return "SerializableExample{" +
                "uname='" + uname + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }

    String uname;
    String pass;
    public SerializableExample(String uname,String pass){
        this.uname=uname;
        this.pass=pass;
        //toString();
    }

}
 class SerializableDemo {
    public static void main(String[] args) throws IOException {

        SerializableExample s=new SerializableExample("pooja","pooja");
//        s.uname="pooja";
//        s.pass="melayer";
        FileOutputStream fout=new FileOutputStream("/home/pooja/Desktop/gg.txt");
        ObjectOutputStream out=new ObjectOutputStream(fout);

       out.writeObject(s.toString());
     //  out.writeObject(s.pass);
       // out.flush();
       System.out.println("success");
       //out.close();
       //fout.close();

    }
}
