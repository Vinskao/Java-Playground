package hw5.EmployeeFile;

public class test {
    public static void main(String[] args) {
        Manager managerSalary = new Manager(1000000, 2400, "TY", "Male", "tianyikao@gmail.com");
        managerSalary.setBonus(2000000);
        managerSalary.setCommuteAllowance(3000);
        managerSalary.giveSalary();

        NormalEmployee normalSalary = new NormalEmployee(700000,2400, "Chiaki", "Female", "sackerchiaki@gmail.com");
        normalSalary.giveSalary();

        SalesEmployee salesSalary = new SalesEmployee(400000,2400,"Sorane","Female", "morichikusorane@gmail.com");
        salesSalary.setSalesBonus(1000000);
        salesSalary.giveSalary();

        TempEmployee tempSalary = new TempEmployee(200, "Tesar Z", "Female", "zztesar@gmail.com");
        tempSalary.giveSalary();
    }
}
