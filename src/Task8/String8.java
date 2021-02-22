package Task8;

public class String8 {
    //Вводится строка слов, разделенных пробелами.
    // Найти самое длинное слово и вывести его на экран. Случай, когда самых длинных слов может быть несколько, не обрабатывать.
    public static void main(String[] args) {
        String text = "the world is beautiful when there is no war in the world";

        System.out.println(longWord(text));

    }

    public static String longWord(String str) {
        String[] str1 = str.split(" ");
        String max = "";

        for (int i = 0; i < str1.length; i++) {

            if (str1[i].length() >= max.length()) {
                max = str1[i];
            }
        }
        return max;
    }
}
