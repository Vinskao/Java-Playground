package Animal;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.run();
        Cat cat = new Cat();
        cat.run();
        animal = cat;
        animal.run();

        Animal[] animals = new Animal[3];
        animals[0] = new Feline();
        animals[1] = new Cat();
        animals[2] = new Animal();
        for (Animal ani : animals){
            ani.run();
        }
    }
}
