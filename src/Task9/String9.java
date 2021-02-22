package Task9;

public class String9 {
    //Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
    // Учитывать только английские буквы.
    public static void main(String[] args) {
        String text = "Java Java";
        numberLetters(text);
    }

    public static StringBuilder removeSpaces(String str) {
        StringBuilder sss = new StringBuilder();
        char[] array = str.toCharArray();

        for (int i = 0; i < array.length; i++) {
            if (array[i] != ' ') {
                sss.append(array[i]);
            }
        }
        return sss;
    }

    public static void numberLetters(String str) {
        int numberCapitalLetters = 0;
        int numberSmallLetters = 0;
        String str1 = removeSpaces(str).toString();
        char[] array = str1.toCharArray();

        for (int i = 0; i < array.length; i++) {
            if (Character.isUpperCase(array[i])) {
                numberCapitalLetters++;
            } else {
                numberSmallLetters++;
            }
        }
        System.out.println("Маленькие буквы:" + numberSmallLetters);
        System.out.println("Большие буквы:" + numberCapitalLetters);
    }
}
