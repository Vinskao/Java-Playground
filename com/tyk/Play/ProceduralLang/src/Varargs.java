public class Varargs {
    public static int sum(int... nums) {
        int total = 0;
        for (int n: nums) { //nums 是一個整數的陣列。
            total += n;
        }
        return total;
    }
    public int msum(int a, int b, int... nums) {
        int mtotal = a + b;
        for (int num : nums) {
            mtotal += num;
        }
        return mtotal;
    }
    public static void main(String[] args) {
        System.out.println(sum(1,3,4));
        int[] nums = {1,4,4};
        System.out.println(sum(nums));
    }
}
