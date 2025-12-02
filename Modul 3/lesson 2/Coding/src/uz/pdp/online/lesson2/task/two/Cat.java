package uz.pdp.online.lesson2.task.two;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " meow-meow");
    }
}