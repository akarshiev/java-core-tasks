import java.util.*;

class Main {
    public static void main() {
        ///* 1-masala *///
        /*
        // Birinchi masala
        List<Integer> nums = new ArrayList<Integer>(30);

        Random random = new Random();
        int min = 0;
        int max = 100;

        for (int i = 0; i < 30; i++) {
            int randomNum = random.nextInt(max - min + 1) + min;
            nums.add(randomNum);
        }

        System.out.println(nums);
        int randomIndex = random.nextInt(nums.size());
        nums.remove(randomIndex);
        System.out.println("O'chiriladigan indeks raqam: " + randomIndex);
        System.out.println("O'chiriladigan raqam: " + nums.get(randomIndex));
        System.out.println("nums = " + nums);
        */

        /*LinkedList<Integer> nums = new LinkedList<>();

        Random random = new Random();
        int min = 0;
        int max = 100;

        for (int i = 0; i < 30; i++) {
            int randomNum = random.nextInt(max - min + 1) + min;
            nums.add(randomNum);
        }

        System.out.println("nums = " + nums);
        int randomIndex = random.nextInt(nums.size());
        nums.remove(randomIndex);
        int deletedValue = nums.get(randomIndex);
        System.out.println("O'chiriladigan indeks raqam: " + randomIndex);
        System.out.println("O'chiriladigan raqam: " + deletedValue);
        System.out.println("nums = " + nums);*/


        ///  2-vazifa    ///



        /*List<String> names = new ArrayList<>();

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
        }*/

        /*LinkedList<String> names = new LinkedList<>();

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

        System.out.println("names = " + names);

        List<String> uniqueNames = new ArrayList<>();
        ListIterator<String> iter = names.listIterator();

        while (iter.hasNext()) {
            String currentName = iter.next();

            if (uniqueNames.contains(currentName)) {
                iter.remove();
            } else {
                uniqueNames.add(currentName);
            }
        }

        System.out.println("names = " + uniqueNames);*/

        ///  3-vazifa    ///
        /**
         Book classini yarating uni ichida book larni saqlovchi list1 va list2
         listlarini yarating list1 ni 10 book objectni bilan toldiring.
         list2 ni esa random son orqali list1dan tanlab olingan 5 ta element ni bering.
         Ikkala listni ham ekranga chizing
         list1 dan list2 da bor elementlarni ochirib tashlang
         Qaytadan 2la listni ham qayta ekranga chiqaring
         */

        /*Random random = new Random();

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
        System.out.println("List 2 ning hajmi: " + list2.size());*/

        Random random = new Random();

        List<Book> list1 = new LinkedList<>();

        String[] titles = {"Ufq", "Sariq devni minib", "Otgan kunlar", "Yulduzli tunlar",
                "Shaytanat", "Urush va tinchlik", "Alkimyogar", "Boburnoma",
                "Ibratli hayot", "O'tkan kunlar"};
        String[] authors = {"P. Qodirov", "H. G'ulom", "A. Qodiriy", "P. Qodirov",
                "O. Hoshimov", "L. Tolstoy", "P. Koelo", "Z.M. Bobur",
                "A. Qahhor", "A. Qodiriy"};

        for (int i = 0; i < 10; i++) {
            list1.add(new Book(i + 1, titles[i], authors[i]));
        }

        List<Book> list2 = new LinkedList<>();
        List<Integer> selectedIndexes = new LinkedList<>();

        while (list2.size() < 5) {
            int randomIndex = random.nextInt(list1.size());

            if (!selectedIndexes.contains(randomIndex)) {
                selectedIndexes.add(randomIndex);

                list2.add(list1.get(randomIndex));
            }
        }


        System.out.println("List 1: ");
        list1.forEach(System.out::println);

        System.out.println("\nList 2: ");
        list2.forEach(System.out::println);

        list1.removeAll(list2);

        System.out.println("List 1: ");
        list1.forEach(System.out::println);
        System.out.println("list1.size() = " + list1.size());

        System.out.println("\nList 2: ");
        list2.forEach(System.out::println);
        System.out.println("list2.size() = " + list2.size());
    }
}