package Task1;

public class String1 {
    //Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
    public static void main(String[] args) {
        String text = "the  world  12 is beautiful  45      when 42 there11 is no 3 war in 2 the world";
        char[] array = text.toCharArray();

        int t = 0; // количество пробелов
        int max = 0; // максимвльное количество пробелов

        for (int i = 0; i < array.length; i++) {
            if (array[i] == ' ') {
                t = 1;
                while (array[i] == ' ' && array[i++] == ' ') {
                    t++;

                }
                if (max < t) {
                    max = t - 1;
                }
            }

        }
        System.out.println(max);

    }
}

