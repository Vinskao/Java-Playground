package SeparateMain;

public class Account {
    private String accountNo;
    private double balance;
    public Account(String accountNo, double balance){
        this.accountNo = accountNo;
        this.balance = balance;
    }
    // getter and setter
    public String getAccountNo(){
        return accountNo;
    }
    public void setAccountNo(String accountNo){
        this.accountNo = accountNo;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }

    public void printAccData() {
        System.out.println("Account " + accountNo + " " + balance);
    }
}
