public class diamondPattern {
    public static void main (String[] args)
    {

        for (int i=1;i<=5;i++)
        {
            for (int j=1;j<=9;j++)
            {
                if ((i+j>=6)||(j>(9-(i+j))))
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
