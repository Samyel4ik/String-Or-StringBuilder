package Task2;

public class String2 {
    //В строке вставить после каждого символа 'a' символ 'b'.
    public static void main(String[] args) {
        String str = "Java programming language";
        char[] array = str.toCharArray();

        StringBuilder sss = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            sss.append(array[i]);
            if (array[i] == 'a') {
                sss.append('b');
            }
        }
        System.out.println(sss.toString());
    }

}
