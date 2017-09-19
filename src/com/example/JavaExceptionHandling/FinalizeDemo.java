package com.example.JavaExceptionHandling;

/**
 * Created by pooja on 19/9/17.
 */
class FinalizeExample
{
    public void finalize()
    {
        System.out.println("Finalize method");
    }
}
public class FinalizeDemo
{
    public static void main(String[] args)
    {
        FinalizeExample f1=new FinalizeExample();
        FinalizeExample f2=new FinalizeExample();
        f1=null;
        f2=null;
        System.gc();
    }
}
