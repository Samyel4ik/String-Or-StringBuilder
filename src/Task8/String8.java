package Task8;

public class String8 {
    //Вводится строка слов, разделенных пробелами.
    // Найти самое длинное слово и вывести его на экран. Случай, когда самых длинных слов может быть несколько, не обрабатывать.
    public static void main(String[] args) {
        String text = "the world is beautiful when there is no war in the world";
        char [] array = text.toCharArray();

        StringBuilder max = new StringBuilder();

        int t = 0;
        int m = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i]!=' '){
                t++;

            }
        }
    }
}
