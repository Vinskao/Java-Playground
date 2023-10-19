package Interface2;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Animal animal = dog;
        animal.run();
        Cat cat = new Cat();
        cat.run();
        animal = cat;
        animal.run();

        Animal[] animals = new Animal[2];
        animals[0] = new Dog();
        animals[1] = new Cat();
        for (Animal ani : animals){
            ani.run();
        }
    }
}
