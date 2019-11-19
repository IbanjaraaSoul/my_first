import java.util.Scanner;

public class marriageEligible {
    public static void main (String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int girl_Age = sc.nextInt();
        int boy_Age = sc.nextInt();
        if ((girl_Age>=18)&&(boy_Age>=21))
        {
            System.out.println( " eligible for marriage");
            System.out.println( " eligible for marriage");

        }
        else
        {
            System.out.println(" not eligible for marriage");
        }
    }
}
