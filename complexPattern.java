import java.util.Scanner;

public class complexPattern {
    public static void main (String[] args)
    {

        for (int i=1;i<=5;i++)
        {
            for (int j=1;j<=12;j++)
            {
                if ((i==j)||(i+1==j)||(i+j==13)||(i+j==12))
                {
                    System.out.print("*");
                }

                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
