package Task3;

public class String3 {
    // Проверить, является ли заданное слово палиндромом/
    public static void main(String[] args) {
        String str = "jasartvfaj";

        StringBuilder str1 = new StringBuilder(str);
        str1.reverse();
        String str3 = str1.toString();

        if (str.equalsIgnoreCase(str3)) {
            System.out.println("Это слово является палиандром");
        } else {
            System.out.println("Это слово не является палиандром");
        }
        //System.out.println(str.equalsIgnoreCase(str3));  // сразу выведет true false без учета регистра
        //System.out.println(str.equals(str3)); // с учетом регистра символов сравнит слово на полиандром.

    }
}
