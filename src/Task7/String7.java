package Task7;

public class String7 {
    //Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
    // Например, если было введено "abc cde def", то должно быть выведено "abcdef".
    public static void main(String[] args) {
        String str = "abc cde def";
        char[] array = str.toCharArray();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            if (!result.toString().contains(String.valueOf(array[i])) && array[i] != ' ') {
                result.append(array[i]);
            }
        }
        System.out.println(result.toString());
    }
}
