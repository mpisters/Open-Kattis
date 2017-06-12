import java.util.Scanner;

/**
 * Created by michelle on 24-4-17.
 */
public class Faktor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int totalPublished = sc.nextInt();
            int faktor = sc.nextInt();
            int total = (totalPublished * (faktor - 1)) + 1;
            System.out.println(total);
        }
    }
}
