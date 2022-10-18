import java.util.Scanner;

public class AtmClientApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Atm myAtm = new Atm(500.00, "1234");

        System.out.println("Welcome to Money Bank");
        System.out.println("Please enter your pin");
        String userEnteredPin = input.nextLine();

        while (myAtm.accessAccount(userEnteredPin) == false) {
            System.out.println("Incorrect Pin");
            userEnteredPin = input.nextLine();

        }

        System.out.println("Please select from the menu below");
        System.out.println("Press 1 to make a deposit");
        System.out.println("Press 2 to make a withdrawal");
        System.out.println("Press 3 to check balance");
        System.out.println("Press 4 to exit");
        String userChoice = input.nextLine();

        while (!userChoice.equals("4")) {
            if (userChoice.equals("1")) {
                System.out.println("Deposit");
                System.out.println("Enter the amount to Deposit");
                double amountToDeposit = input.nextDouble();
                input.nextLine();
                myAtm.deposit(amountToDeposit);


            } else if (userChoice.equals("2")) {
                System.out.println("Withdrawl");
                System.out.println("Enter the amount to Deposit");
                double amountToWithdraw = input.nextDouble();
                input.nextLine();
                myAtm.withdrawl(amountToWithdraw);


            } else if (userChoice.equals("3")) {
                System.out.println("Checking balance");
                System.out.println("Your balance is " + myAtm.getBalance());


            } else {
                System.out.println("I'm sorry I don't understand");
            }

            System.out.println("Press 1 to make a deposit");
            System.out.println("Press 2 to make a withdrawal");
            System.out.println("Press 3 to check balance");
            System.out.println("Press 4 to exit");
            userChoice = input.nextLine();

        }


    }

}
