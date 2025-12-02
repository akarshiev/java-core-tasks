package uz.pdp.online.lesson2.task.two;

public class Sheep extends Animal {
    public Sheep(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " baa-baa");
    }
}
