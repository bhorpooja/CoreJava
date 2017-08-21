package JavaControlStatements;

import java.util.Scanner;

/**
 * Created by i net on 09/08/2017.
 */
public class multiSwitch {
    int a, b, res, ch, ch1, i, j, k;
    Scanner s = new Scanner(System.in);
    public void getNum(){
        System.out.println("Enter First Number");
        a = s.nextInt();
        System.out.println("Enter Second Number");
        b = s.nextInt();
    }
    void swich() {

        do {

            System.out.println("\n 1.Arithmatic Operation\n2.Control Statement\n3.Exit");
            System.out.println("\n Enter your choice");
            ch = s.nextInt();
            switch (ch) {
                case 1:
                    do {
                        System.out.println("\n 1.ADD\n2.SUB\n3.MUL\n4.DIV\n5.Exit");
                        System.out.println("\n Enter your choice");
                        ch1 = s.nextInt();
                        switch (ch1) {
                            case 1:
                                res = a + b;
                                System.out.println("\n Addition=" + res);
                                break;
                            case 2:
                                res = a - b;
                                System.out.println("Subtraction=" + res);
                                break;
                            case 3:
                                res = a * b;
                                System.out.println("Multiplication=" + res);
                                break;
                            case 4:
                                res = a / b;
                                System.out.println("Division=" + res);
                                break;
                            case 5:
                                swich();
                                return;
                            default:
                                System.out.println("\n Invalid Choice....");
                        }
                    } while (ch1 <= 5);
                    break;
                case 2:
                    System.out.println("\n Value of result="+res);
                    if (res >= 40) {
                        if (res >= 40 && res <= 64) {
                            if (res % 2 == 0)
                                System.out.println("\n The Number is EVEN Number");
                            else
                                System.out.println("\n The Number is ODD Number");
                        }
                        if (res > 65) {
                            if (res % 2 == 0)
                                System.out.println("\n The Number is EVEN Number");
                            else
                                System.out.println("\n The Number is ODD Number");
                        }
                        for (i = 1; i <= res; i++) {
                            for (j = res; j >= i; j--) {
                                System.out.print(" ");
                            }
                            for (k = 1; k <= (2*i-1) ; k++) {
                                System.out.print("*");
                            }
                            System.out.println("");
                        }
                    }
                    else
                        System.out.println("\n u r failed");
                    break;
                case 3:
                    return;
                default:
                    System.out.println("\n Invalid Choice");
            }

        } while (ch <= 3);

    }


    public static void main(String[] args) {
        multiSwitch ms=new multiSwitch();
        ms.getNum();
        ms.swich();

    }
}
