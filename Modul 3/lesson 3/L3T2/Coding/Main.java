import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Ali");
        names.add("Vali");
        names.add("Hasan");
        names.add("Husan");
        names.add("Dildora");
        names.add("Sarvar");
        names.add("Ali");
        names.add("Zafar");
        names.add("Nodir");
        names.add("Vohid");
        names.add("Sardor");
        names.add("Laylo");
        names.add("Gulnoza");
        names.add("Dildora");
        names.add("Vohid");
        names.add("Olim");

        System.out.println(names);
        System.out.println("List hajmi: " + names.size());

        Set<String> uniqueNames = new HashSet<>(names);
        names.clear();
        names.addAll(uniqueNames);
        System.out.println("Yangi list hajmi: " + names.size());

        Iterator<String> iterator = names.iterator();
        int index = 0;

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println("Index [" + index + "]: " + name);
            index++;
        }
    }
}