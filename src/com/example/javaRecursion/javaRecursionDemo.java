package com.example.javaRecursion;

/**
 * Created by pooja on 8/9/17.
 */
class Factorial{
    //Scanner s=new Scanner(System.in);
    int temp;
    int fact(int num){
        int fact=1;
        temp=num;
        while (num>0){
            fact=fact*num;
            num=num-1;
        }
        //System.out.println("Factorial of "+temp+"="+fact);
        return fact;
    }
    void showFact(){
        int factorial=fact(5);
        System.out.println("Factorial of "+temp+"="+factorial);

    }
}
class Fibonacci{
    int n1=0,n2=1,n3;
    Integer[] arr=new Integer[100];
    StringBuilder fibSeries(int count){
        System.out.println("First two elements of fibonacci series are "+n1+" "+n2);
        StringBuilder st=new StringBuilder();
        for(int i=0;i<count-2;i++){
            n3=n1+n2;
            //System.out.print(n3+" ");
            st=st.append(n3+" ");
            n1=n2;
            n2=n3;

        }
        return st;
    }
}
public class javaRecursionDemo {
    public static void main(String[] args) {
        Factorial f=new Factorial();
        f.showFact();
        Fibonacci fb=new Fibonacci();
        StringBuilder str=fb.fibSeries(20);
        System.out.println(str);
    }
}
