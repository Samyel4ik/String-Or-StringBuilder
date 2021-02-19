package Task5;

public class String5 {
    //Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
    public static void main(String[] args) {
        String text = "the world 12 is beautiful 45 when 42 there11 is no 3 war in 2 the world";
        char[] array = text.toCharArray();

        int t = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'a') {
                t++;
            }
        }
        System.out.println("Символ 'а' встречается:" + t + " раз");
    }
}
