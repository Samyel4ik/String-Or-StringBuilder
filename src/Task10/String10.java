package Task10;

public class String10 {
    //Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным знаком.
    // Определить количество предложений в строке X.
    public static void main(String[] args) {
        String text = "The world is beautiful. When there is no war in the world! Java?";
        String sing = "!?.";
        char[] array = text.toCharArray();

        int t = 0;
        for (int i = 0; i < array.length; i++) {
            if(sing.contains(String.valueOf(array[i]))){
                t++;
            }
        }
        System.out.println("В строке:" + t + "предложений");
    }
}
