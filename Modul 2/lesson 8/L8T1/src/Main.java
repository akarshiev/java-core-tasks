import com.pdp.online.task.two.*;

public class Main {
    public static void main(String[] args) {

        User defaultUser = new User();
        defaultUser.printInfo();

        Location loc = new Location("Toshkent", "Sergeli", 45);
        User customUser = new User("Abdukarim", "998935782021", loc);
        customUser.printInfo();
    }
}
