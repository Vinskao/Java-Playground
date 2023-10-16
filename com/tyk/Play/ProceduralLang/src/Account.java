public class Account {
    String accountNo;
    double balance;
    public Account(String accountNo, double balance){
        this.accountNo = accountNo;
        this.balance = balance;
    }
    public void printAccData() {
        System.out.println("Account " + accountNo + " " + balance);
    }
    public static void main(String[] args) {
        Account a = new Account("12345" , 1400);
        a.printAccData();
    }
}
