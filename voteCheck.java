import java.util.Scanner;

public class voteCheck {
    public static void main (String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >18)
        {
            System.out.println(age + " is eligible for voting");

        }
        else
        {
            System.out.println(age + " is not eligible for voting");
        }
    }
}
