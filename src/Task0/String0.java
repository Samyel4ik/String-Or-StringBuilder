package Task0;

public class String0 {
    //дана строка "thirdOneWithMoreWords",
    // преобразовать её в строку "third_one_with_more_words" с использованием StringBuilder
    public static void main(String[] args) {
        String str = "thirdOneWithMoreWords";

        char[] array = str.toCharArray();
        StringBuilder str1 = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            if (Character.isUpperCase(array[i])) {
                str1.append("_");
            }

            str1.append(Character.toLowerCase(array[i]));

        }
        System.out.println(str1.toString());
    }
}
