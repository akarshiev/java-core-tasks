import uz.pdp.online.tasks.one.Car;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Name, color, model fiieldlardan iborat Car clasini yarating -> done
        Car classini va price ni saqlovchi map yarating -> done
        map elementlari ekranga chizilsin -> done
        berilgan price chegari bo'yicha yani berilgan pricedan
        kichik bo'lgan mashinalar malumotlari price bilan ekranga
        chiqaradigan method ham yozing -> done
        */

        Map<Integer, Car> map = new HashMap<>();

        map.put(895, new Car("Tesla", "Black", "Tesla X"));
        map.put(795, new Car("BMW", "White", "X7"));
        map.put(587, new Car("Audi", "Black", "A6"));
        map.put(695, new Car("Mercedes", "White", "Mercedes-Benz EQE SUV"));

        map.forEach((price, value) -> {
            System.out.printf("""
                    ----------
                    Price: $%d
                    Car: %s
                    ----------
                    """.formatted(price, value));
        });

        inputPrice(map);

    }

    public static void inputPrice(Map<Integer, Car> map) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Narxni kiriting: ");
        int price = scanner.nextInt();

        for (Map.Entry<Integer, Car> entry : map.entrySet()) {
            if (entry.getKey() < price) {
                System.out.println("--------------------------");
                System.out.println("Price: $" + entry.getKey());
                System.out.println("Car: \n" + entry.getValue());
            }
        }
        scanner.close();
    }
}
