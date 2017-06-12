import java.util.Scanner;

public class AlphabetSpam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String whitespaces = string.replaceAll("[^\\_]+", "");
        System.out.println( whitespaces.length() * 100 / string.length());
        String lowercase = string.replaceAll("[^a-z]" , "");
        System.out.println(string.length() / lowercase.length());
        String uppercase = string.replaceAll("[^A-Z]", "");
        System.out.println(string.length() / uppercase.length());
        String symbols = string.replaceAll("[A-Za-z0-9]", "");
        System.out.println(string.length() / (symbols.length() - whitespaces.length()));
    }
}
