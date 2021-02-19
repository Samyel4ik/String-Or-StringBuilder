package Task7;

public class String7 {
    //Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
    // Например, если было введено "abc cde def", то должно быть выведено "abcdef".
    public static void main(String[] args) {
        String str = "abc cde def";
        char[] array = str.toCharArray();
        StringBuilder sss = new StringBuilder();


        for (int i = 0; i < array.length; i++) {
            if (array[i] != ' ') {
                sss.append(array[i]);
            }
        }

        String str1 = sss.toString();
        char[] array1 = str1.toCharArray();
        StringBuilder sss1 = new StringBuilder();

        boolean t;                                          // флажок проверки повторяемости тип
        for (int i = 0; i < array1.length; i++) {
            t = false;
            for (int j = i + 1; j < array1.length; j++) {

                if (array1[i] == array1[j]) {
                    t = true;
                    break;
                }
            }
            if (!t) {
                sss1.append(array1[i]);
            }
        }
        System.out.println(sss1.toString());
    }

}

