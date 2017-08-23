package JavaInheritance;

/**
 * Created by pooja on 21/8/17.
 */
class Bank{
    void rateOfInterest() {
        System.out.println("0");
    }
}
class SBI extends Bank{
    void rateOfInterest()
    {
        System.out.println("4");
    }
}
class ICICI extends Bank{
    void rateOfInterest(){
        System.out.println("5");
    }
}
public class javaOverriding {
    public static void main(String[] args) {
        SBI s=new SBI();
        ICICI i=new ICICI();
        s.rateOfInterest();
        i.rateOfInterest();

    }
}
