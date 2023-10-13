public class Overloading {

    static void greeting(String name){
        System.out.println("Hello! " + name);
    }
    static void greeting(String name,  int n){
        for (int i = 0; i <= n; i++){
            System.out.println("Hello! " + name);
        }
    }
    public static void main(String[] args) {
        greeting("Wavo");
        greeting("Wavo", 3);

    }
}
