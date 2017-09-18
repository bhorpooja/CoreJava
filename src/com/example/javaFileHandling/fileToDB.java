package com.example.javaFileHandling;

import java.io.*;
import java.sql.*;

/**
 * Created by pooja on 12/9/17.
 */
public class fileToDB {
//        String url="jdbc:mysql://localhost:3306/Demo";
//        String uname="pooja";
//        String pass="pooja";
//        Connection con=null;
//        Statement st=null;
//        ResultSet rs=null;
        void writeToTable()  {
            try {
                Class.forName("com.mysql.jdbc.Driver");
               Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Demo","root","pooja");
               PreparedStatement st=con.prepareStatement("insert into Stud values(?,?,?);");
               FileInputStream fin = new FileInputStream("/home/pooja/Data.txt");
                DataInputStream din=new DataInputStream(fin);
                BufferedReader br=new BufferedReader(new InputStreamReader(din));
                String id,name,city;
                 String values=null;
                while ((values=br.readLine())!=null){
                    String[] str= values.split(":");
                    id=str[0];
                    name=str[1];
                    city=str[2];
                   // String query="insert into Stud values('"+id+"','"+name+"','"+city+"')";
                    st.setString(1,id);
                    st.setString(2,name);
                    st.setString(3,city);
                    int r=st.executeUpdate();
                   // System.out.println("");
                    System.out.println(id+" "+name+" "+city+" ");
                }
                st.close();
                con.close();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
             catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    public static void main(String[] args)  {
        fileToDB file=new fileToDB();
        file.writeToTable();
    }
}
