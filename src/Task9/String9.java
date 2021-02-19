package Task9;

public class String9 {
    //Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
    // Учитывать только английские буквы.
    public static void main(String[] args) {
        String text = "The World is beautiful when there is no War in the world";

        char [] array = text.toCharArray();
        int t = 0; // кол бол букв
        int x = 0; // кол мал букв
        for (int i = 0; i < array.length; i++) {
            if (Character.isUpperCase(array[i])){
                t++;
            }else {
                x++;
            }
        }
        System.out.println("Маленькие буквы:" + x);
        System.out.println("Большие буквы:" + t);
    }
}
