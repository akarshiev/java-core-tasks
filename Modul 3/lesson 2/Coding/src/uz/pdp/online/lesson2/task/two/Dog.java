package uz.pdp.online.lesson2.task.two;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " woof");
    }
}
