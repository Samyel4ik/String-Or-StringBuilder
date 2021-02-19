package Task8;

public class String8 {
    //Вводится строка слов, разделенных пробелами.
    // Найти самое длинное слово и вывести его на экран. Случай, когда самых длинных слов может быть несколько, не обрабатывать.
    public static void main(String[] args) {
        String text = "the world is beautiful when there is no war in the world";

        String[] str = text.split(" ");       // массив из слов разделитель котрых пробел !!!!
        String max = "";                        // максимальное слово

        for (int i = 0; i < str.length; i++) {

            if (str[i].length() >= max.length()) {
                max = str[i];
            }
        }
        System.out.println(max);
    }
}
