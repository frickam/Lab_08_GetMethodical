import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int year = SafeInput.getRangedInt(in, "Enter the year you were born: ", 1950, 2015);
        int month = SafeInput.getRangedInt(in, "Enter the month you were born: ", 1, 12);
        int day = SafeInput.getRangedInt(in, "Enter the Day you were born: ", 1, 31);
        int hour = SafeInput.getRangedInt(in, "Enter the hour you were born: ", 1, 24);
        int minute = SafeInput.getRangedInt(in, "Enter the minute you were born: ", 1, 59);
        System.out.println();
        System.out.println("You were born on " + month + "/" + day + "/" + year + " at the time " + hour + ":" + minute);
    }

}
