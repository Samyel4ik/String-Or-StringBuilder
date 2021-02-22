package Task9;

public class String9 {
    //Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
    // Учитывать только английские буквы.
    public static void main(String[] args) {
        String text = "Java Java";
        int numberCapitalLetters = numberCapitalLetters(removeSpaces(text));             // кол больших букв
        System.out.println("Количество больших букв:" + numberCapitalLetters);
        String str2 = removeSpaces(text);                                               // количество букв без пробелов
        int numberSmallLetters = removeSpaces(text).length() - numberCapitalLetters;    //количество маленьких букв
        System.out.println("Количество маленьких букв:" + numberSmallLetters);

    }

    public static String removeSpaces(String str) {         // удалили пробелы
        StringBuilder sss = new StringBuilder();
        char[] array = str.toCharArray();

        for (int i = 0; i < array.length; i++) {
            if (array[i] != ' ') {
                sss.append(array[i]);
            }
        }
        return sss.toString();
    }

    public static int numberCapitalLetters(String str) {     // нашли большие буквы
        int numberCapitalLetters = 0;
        char[] array = str.toCharArray();

        for (int i = 0; i < array.length; i++) {
            if (Character.isUpperCase(array[i])) {
                numberCapitalLetters++;
            }
        }
        return numberCapitalLetters;
    }
}
