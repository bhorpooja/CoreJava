import java.io.*;

/**
 * Created by pooja on 19/9/17.
 */
class SerializableExample implements Serializable{
    @Override
    public String toString() {
        return "SerializableExample{" +
                "uname='" + uname + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }

    String uname;
     String pass;


}
public class SerializableDemo {
    public static void main(String[] args) throws IOException {
        File file=new File("/home/pooja/Desktop/User.txt");
        FileOutputStream fout=new FileOutputStream(file);

        SerializableExample s=new SerializableExample();
        s.uname="pooja";
        s.pass="pooja";

        String str=new String(String.valueOf(s));
        byte[] b=str.getBytes();
        fout.write(b);
        System.out.println("success");
        fout.close();

    }
}
