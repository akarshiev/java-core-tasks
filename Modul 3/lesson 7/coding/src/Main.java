import java.util.*;

class Main {
    private static final Map<String, List<String>> dictionaryMap = new HashMap<>();

    public static void main(String[] args) {
        dictionaryMap.put("Uy", List.of("House", "Home", "Dwelling"));
        dictionaryMap.put("Kitob", List.of("Book"));
        dictionaryMap.put("Maktab", List.of("School", "Academy"));
        dictionaryMap.put("Daraxt", List.of("Tree"));
        dictionaryMap.put("Qiziq", List.of("Interesting", "Funny", "Exciting"));

        dictionaryMap.forEach((uzbek, englishList) -> {
            String engTranslations = String.join(", ", englishList);
            System.out.printf("Uzbekcha: %-10s -> Englishcha: [%s]\n", uzbek, engTranslations);
        });

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nTarjima uchun so'zni kiriting (Uzbek/English): ");
        String input = scanner.nextLine().trim();

        if (input.isEmpty()) {
            System.out.println("So'z kiritilmadi.");
        } else {
            searchAndTranslate(input);
        }

        scanner.close();
    }

    public static void searchAndTranslate(String wordToTranslate) {
        String capitalizedInput = wordToTranslate.substring(0, 1).toUpperCase() + wordToTranslate.substring(1).toLowerCase();

        if (dictionaryMap.containsKey(capitalizedInput)) {
            List<String> translations = dictionaryMap.get(capitalizedInput);
            System.out.println("\nTarjima topildi (Uzbek -> English):");
            System.out.printf("%sning tarjimalari: %s\n",
                    capitalizedInput, String.join(", ", translations));
            return;
        }

        for (Map.Entry<String, List<String>> entry : dictionaryMap.entrySet()) {
            if (entry.getValue().contains(capitalizedInput) || entry.getValue().contains(wordToTranslate.toLowerCase())) {
                System.out.println("\nTarjima topildi (English -> Uzbek):");
                System.out.printf("%s'ning uzbekcha tarjimasi: %s\n",
                        wordToTranslate, entry.getKey());
                return;
            }
        }
        System.out.println("\nlug'atda '%s' so'zi topilmadi.".formatted(wordToTranslate));
    }
}