import uz.pdp.online.lesson2.task.three.*;

public class Main {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();

        System.out.println("--- 1. Boshlang'ich holatni tekshirish ---");
        System.out.println("Ro'yxat bo'shmi? " + myList.isEmpty());
        System.out.println("Hajmi: " + myList.size());

        System.out.println("\n--- 2. Elementlarni qo'shish (add) ---");
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Cherry");
        myList.add("Date");
        System.out.println("Ro'yxat: " + myList);
        System.out.println("Hajmi: " + myList.size());
        System.out.println("Ro'yxat bo'shmi? " + myList.isEmpty());

        System.out.println("\n--- 3. Elementni olish (get) ---");
        System.out.println("0-indeksdagi element: " + myList.get(0));
        System.out.println("2-indeksdagi element: " + myList.get(2));

        System.out.println("\n--- 4. Elementni o'chirish (remove) ---");
        String removed = myList.remove(1);
        System.out.println("O'chirilgan element: " + removed);
        System.out.println("Yangi ro'yxat: " + myList);
        System.out.println("Hajmi: " + myList.size());

        System.out.println("\n--- 5. Hajmni dinamik oshirish (Misol) ---");
        for (int i = 0; i < 8; i++) {
            myList.add("Element-" + (i+1));
        }
        System.out.println("Hajmi oshirilgan ro'yxat: " + myList);
        myList.add("Oxirgi Element");
        System.out.println("Oxirgi ro'yxat: " + myList);

        System.out.println("\n--- 6. Tozalash (clear) ---");
        myList.clear();
        System.out.println("Tozalashdan keyingi ro'yxat: " + myList);
        System.out.println("Ro'yxat bo'shmi? " + myList.isEmpty());
        System.out.println("Hajmi: " + myList.size());
    }
}