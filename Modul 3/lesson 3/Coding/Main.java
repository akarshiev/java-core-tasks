import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Main {
    public static void main(String[] args) {
        Random random = new Random();

        List<Book> list1 = new ArrayList<>();
        String[] titles = {"Ufq", "Sariq devni minib", "O'tgan kunlar", "Yulduzli tunlar",
                "Shaytanat", "Urush va tinchlik", "Alkimyogar", "Boburnoma",
                "Ibratli hayot", "O'tkan kunlar"};
        String[] authors = {"P. Qodirov", "H. G'ulom", "A. Qodiriy", "P. Qodirov",
                "O. Hoshimov", "L. Tolstoy", "P. Koelo", "Z.M. Bobur",
                "A. Qahhor", "A. Qodiriy"};

        for (int i = 0; i < 10; i++) {
            list1.add(new Book(i + 1, titles[i], authors[i]));
        }

        List<Book> list2 = new ArrayList<>();
        List<Integer> selectedIndexes = new ArrayList<>();

        while (list2.size() < 5) {
            int randomIndex = random.nextInt(list1.size());

            if (!selectedIndexes.contains(randomIndex)) {
                selectedIndexes.add(randomIndex);
                list2.add(list1.get(randomIndex));
            }
        }

        System.out.println("\nList 1: ");
        list1.forEach(System.out::println);

        System.out.println("\nList 2: ");
        list2.forEach(System.out::println);
        list1.removeAll(list2);


        System.out.println("\nList 1 : ");
        list1.forEach(System.out::println);
        System.out.println("List 1 ning yangi hajmi: " + list1.size());

        System.out.println("\nList 2: ");
        list2.forEach(System.out::println);
        System.out.println("List 2 ning hajmi: " + list2.size());
    }
}