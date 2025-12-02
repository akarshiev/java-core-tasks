package com.pdp.online.task.two;

public class Application {

    private static Application instance;

    private Application() {}

    public static Application getInstance() {
        if (instance == null) {
            instance = new Application();
        }
        return instance;
    }

    public void run() {
        Phone p1 = new Phone("iPhone 13", Model.IPHONE, 128);
        Phone p2 = new Phone("Samsung S23", Model.SAMSUNG, 256);
        Phone p3 = new Phone("Redmi Note 12", Model.REDMI, 128);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}

