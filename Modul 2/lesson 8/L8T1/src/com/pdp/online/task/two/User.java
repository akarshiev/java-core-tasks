package com.pdp.online.task.two;

public class User {

    private String name;
    private String phone;
    private Location location;

    {
        name = "No Name";
        phone = "No Phone";
        location = new Location(
                "Unknown Region",
                "Unknown District",
                0
        );
    }

    public User() {}

    public User(String name, String phone, Location location) {
        this.name = name;
        this.phone = phone;
        this.location = location;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Location: " +
                location.regionName() + ", " +
                location.districtName() + ", " +
                location.homeNumber()
        );
    }
}
