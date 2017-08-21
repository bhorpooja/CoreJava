package TestProgram;

/**
 * Created by i net on 11/08/2017.
 */
public class Flag {

    public static void main(String[] args) {
        int i,j,k;
        for ( i=0;i<5;i++)
        {
            for ( j=0;j<5;j++)
            {
                System.out.print("* ");

            }
            for ( k=0;k<5;k++)
            {
                System.out.print("= ");

            }
            System.out.println("");
        }
        for (i=0;i<2;i++)
        {
            for(j=0;j<10;j++)
            {
                System.out.print("= ");
            }
            System.out.println("");
        }




    }
}
