package Task4;

public class String4 {
    //M3T2-T4.С помощью функции копирования и операции конкатенации
    // составить из частей слова “информатика” слово “торт”.
    public static void main(String[] args) {
        String str = "информатика";

        System.out.println(t(str) + o(str) + p(str) + t(str));
    }

    public static String t(String str) {
        char[] array = str.toCharArray();
        String str1 = "";

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'т') {
                str1 = new String(String.valueOf(array[i]));
            }
        }
        return str1;
    }

    public static String o(String str) {
        char[] array = str.toCharArray();
        String str1 = "";

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'о') {
                str1 = new String(String.valueOf(array[i]));
            }
        }
        return str1;
    }

    public static String p(String str) {
        char[] array = str.toCharArray();
        String str1 = "";

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'р') {
                str1 = new String(String.valueOf(array[i]));
            }
        }
        return str1;
    }
}
