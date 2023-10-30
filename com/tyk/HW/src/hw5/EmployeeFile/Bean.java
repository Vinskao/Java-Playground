package hw5.EmployeeFile;

public class Bean {
    private Integer typeEmp;
    private Integer baseSalaryInput;
    private String name;
    private String sex;
    private String email;
    private int bonus;
    private int hourlyWage;
    @Override
    public String toString() {
        return "Bean{" +
                "typeEmp=" + typeEmp +
                ", baseSalaryInput=" + baseSalaryInput +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                ", bonus='" + bonus + '\'' +
                ", hourlyWage=" + hourlyWage +
                '}';
    }
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    public int getHourlyWage() {
        return hourlyWage;
    }
    public void setHourlyWage(int hourlyWage) {
        this.hourlyWage = hourlyWage;
    }
    public Integer getTypeEmp(){return typeEmp;} //不接受输入值，它只返回int的值
    public void setTypeEmp(Integer typeEmp){ //接受int輸入值，回傳void
        this.typeEmp = typeEmp;
    }
    public Integer getBaseSalaryInput(){
        return baseSalaryInput;
    }
    public void setBaseSalaryInput(Integer baseSalaryInput){
        this.baseSalaryInput = baseSalaryInput;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getBonus() {
        return bonus;
    }

    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }
}
