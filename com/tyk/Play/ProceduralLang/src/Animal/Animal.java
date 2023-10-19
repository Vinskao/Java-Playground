package Animal;

public abstract class Animal {
    public abstract void run();
    public static void main(String[] args) {
        Animal animal = new Dog(); // Dog is an instance
        animal = new Cat();
        if (animal instanceof Dog){ //检查对象 animal 是否是 Dog 类或其子类的实例
            Dog dog = (Dog)animal; //当animal是Dog实例執行
            dog.bark();
        } else if (animal instanceof Cat){
            Cat cat = (Cat)animal;
            cat.meow();
        }
    }
}
