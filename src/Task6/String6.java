package Task6;

public class String6 {
    //Из заданной строки получить новую, повторив каждый символ дважды.
    public static void main(String[] args) {
        String str = "Java";
        char [] array = str.toCharArray();
        String str1 = "";

        for (int i = 0; i < array.length; i++) {
            str1+= str.substring(i,i+1) + str.substring(i, i+1);//создаем новую строку , возвращая из исходной с помощью метода букву + еще раз
        }
        System.out.println(str1);
    }
}
