public class Atm {

    private double balance;
    private String pin;

   //constructor
    public Atm(double balance, String pin) {
        this.balance = balance;
        this.pin = pin;

    }
//getter method
    public double getBalance() {
        return balance;
    }
//behaivor method
    public void deposit(double deposit) {
        balance += deposit;

    }

    public void withdrawl(double withdrawl) {
        if(withdrawl <= balance) {
            balance -= withdrawl;
        }
    }

    public boolean accessAccount(String enteredPin) {
       if(enteredPin.equals(pin)) {
           return true;
       }

       else{
           return false;
       }
    }
}
