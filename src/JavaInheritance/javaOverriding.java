package JavaInheritance;

/**
 * Created by pooja on 21/8/17.
 */
class Bank{
    int rateOfInterest() {
        return 0;
    }
}
class SBI extends Bank{
    int rateOfInterest()
    {
       return 4;
    }
}
class ICICI extends Bank{
    int rateOfInterest(){
        return 5;
    }
}
public class javaOverriding {
    public static void main(String[] args) {
        SBI s=new SBI();
        ICICI i=new ICICI();
        System.out.println("SBI Rate of Interest = "+s.rateOfInterest());
        System.out.println("ICICI Rate of Interest = "+i.rateOfInterest());

    }
}
