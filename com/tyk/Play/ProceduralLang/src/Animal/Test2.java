package Animal;

public class Test2 {
    public static void main(String[] args) {
        Animal animal = new Dog();
//        animal.bark()
        Dog dog = (Dog)animal;
        dog.bark();
    }
}
