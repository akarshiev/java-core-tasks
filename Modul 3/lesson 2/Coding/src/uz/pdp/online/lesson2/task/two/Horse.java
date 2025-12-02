package uz.pdp.online.lesson2.task.two;

public class Horse extends Animal {
    public Horse(String name) {
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println(getName() + " ");
    }
}
