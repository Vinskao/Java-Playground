package Employee;
public class StaticBlock {
    int num;
    static int count1;
    static {
        count1 = 10;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public static int getCount1() {
        return count1;
    }
    public static void setCount1(int count1) {
        StaticBlock.count1 = count1;
    }
//    public static void main(String[] args) {
//        StaticBlock sb = new StaticBlock();
//        sb.num++;
//        System.out.println(sb.num);
//        count1 ++;
//        System.out.println(count1);
//    }
}
