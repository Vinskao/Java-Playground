package SeparateMain;
public class Test {
    public static void main(String[] args) {
        Account a = new Account("12345" , 1400);
        a.printAccData();
//        Account a = new Account(); 前面已經private全域變數，不准new及使用方法
        a.setAccountNo("666");
        a.setBalance(77777);
        System.out.println(a.getAccountNo() + " " + a.getBalance());
    }
}
