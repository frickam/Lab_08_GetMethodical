import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        boolean done = false;
        double totalPrice = 0.0;

        do
        {
            double price = SafeInput.getRangedDouble(in, "Enter the price for your item: ", 0.50, 10.00);
            totalPrice = totalPrice + price;
            done = SafeInput.getYNConfirm(in, "Are you done entering prices?");
        }
        while(!done);

        System.out.printf("Your total price comes out to: " + totalPrice);
    }
}
