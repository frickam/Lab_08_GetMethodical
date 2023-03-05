import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String ssn = SafeInput.getRegExString(in, "Enter your SSN :", "^\\d{3}-\\d{2}-\\d{4}$");
        String mNumber = SafeInput.getRegExString(in, "Enter your UC M number: ", "^(M|m)\\d{5}$");
        String menuChoice = SafeInput.getRegExString(in, "Open, Save, View, or Quit [O, S, V, Q]: ", "^[OoSsVvQq]$");

        System.out.println("\nYour SSN is: " + ssn);
        System.out.println("\nYour UC M Number is: " + mNumber);
        System.out.println("\nYou chose to: " + menuChoice);

    }
}
