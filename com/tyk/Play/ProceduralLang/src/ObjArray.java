public class ObjArray {
    int employeeId;
    String employeeName;
    public ObjArray(int id, String name) {
        this.employeeId = id;
        this.employeeName = name;
    }
    public void printData() {
        System.out.println(employeeName + " " + employeeId);
    }
    public static void main(String[] args) {
        ObjArray[] emps = new ObjArray[3];
        emps[0] = new ObjArray(111, "TY");
        emps[1] = new ObjArray(112, "SORANE");
        emps[2] = new ObjArray(113, "SAYURI");
        for (int i = 0; i < emps.length; i++) {
            emps[i].printData();
        }
        for (ObjArray emp : emps) {
            emp.printData();
        }

        // 现在你可以在数组中存储 ObjArray 对象
    }
}
