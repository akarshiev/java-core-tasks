package uz.pdp.online.lesson2.task.two;

public class AnimalHouse<T extends Animal> {

    private T resident;

    public AnimalHouse(T resident) {
        this.resident = resident;
        System.out.println(resident.getName());
    }

    public void setResident(T resident) {
        this.resident = resident;
        System.out.println(resident.getName());
    }

    public T getResident() {
        return resident;
    }

    public void checkResidentSound() {
        System.out.print("Uyda: ");
        resident.makeSound();
    }
}