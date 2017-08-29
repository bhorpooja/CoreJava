package JavaString;

/**
 * Created by pooja on 29/8/17.
 */
class Demo{
    String str="Pooja";
    int i;
    char[] arr=str.toCharArray();
    void reverseString()
    {
        for ( i=arr.length-1;i>=0;i--) {

            System.out.print(arr[i] + "\n");



        }//System.out.println(String.valueOf(arr1));
    }
}
public class StringReverse {
    public static void main(String[] args) {
        Demo d=new Demo();
        d.reverseString();
}
}
