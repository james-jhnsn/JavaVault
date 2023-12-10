package bankaccountapp;

public abstract class Account implements IBaseRate {
    // List common properites for saving and checking accounts
    String name;
    String sSN;
    double balance;
    
    static int index = 10000;
    String accountNumber;
    double rate;

    // Constructor to set base properties and intialize the account
    public Account(String name, String sSN, double initDeposit) {
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;
        
        // Set account number
        index++;
        this.accountNumber = setAccountNumber();

        setRate();
    }

    public abstract void setRate();

    private String setAccountNumber() {
        String lastTwoOfSSN = sSN.substring(sSN.length()-2, sSN.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoOfSSN + uniqueID + randomNumber;

    }

    // List common methods
    public void showInfo() {
        System.out.println(
            "NAME: " + name + 
            "\nACCOUNT NUMBER: " + accountNumber + 
            "\nBALANCE: " + balance
        );
    }
}
