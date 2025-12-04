package uz.pdp.online.tasks.one;

public class Car {
    private String name;
    private String color;
    private String model;

    public Car(String name, String color, String model) {
        this.name = name;
        this.color = color;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return name +
                "\ncolor= " + color +
                "\nmodel= " + model;
    }
}
