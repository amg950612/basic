import java.util.Scanner;

public class NotEnoughMoneyException extends Exception {

    private static double moneyOnAccount = 5000;

    private static NotEnoughMoneyException notEnoughMoneyException;

    public static void main(String[] args) throws NotEnoughMoneyException {

        getMoney();
    }

    private static void getMoney()throws NotEnoughMoneyException
    {
        double moneyToDraw;
        Scanner cin = new Scanner(System.in);
        System.out.println("Hello!");
        System.out.println("Money to draw: ");
        moneyToDraw = cin.nextDouble();

        try
        {
            if (moneyOnAccount<moneyToDraw)
            {
                System.out.println("You don't have enough money ;(");
                throw new NotEnoughMoneyException();
            }
            else
            {
                moneyOnAccount = moneyOnAccount - moneyToDraw;
                System.out.println("You have drawn: " + moneyToDraw + " złoty " + "so now on account you have: " + moneyOnAccount + " złoty " );
            }
        }
        finally
        {
            System.out.println("Have a nice day!");
        }
    }
}
