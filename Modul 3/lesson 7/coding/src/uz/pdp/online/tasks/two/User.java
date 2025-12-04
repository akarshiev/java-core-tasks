package uz.pdp.online.tasks.two;

public class User {
    private String name;
    private String phoneNumber;
    private Role role;

    public User(String name, String phoneNumber, Role role) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.role = role;
    }

    @Override
    public String toString() {
        return "\nIsmi= " + name +
                "\nTelefon raqami = " + phoneNumber +
                "\nRole= " + role +
                "\n------------------";
    }
}

