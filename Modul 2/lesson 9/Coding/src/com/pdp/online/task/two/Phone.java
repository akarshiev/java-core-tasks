package com.pdp.online.task.two;

public class Phone {

    private String name;
    private Model model;
    private int storage;

    public Phone(String name, Model model, int storage) {
        this.name = name;
        this.model = model;
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Phone{name='" + name + "', model=" + model + ", storage=" + storage + "GB}";
    }
}

