import java.util.Scanner;

/**
 * Created by michelle on 24-4-17.
 */
public class SimonSays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String simonSays = "simon says";
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            if (line.toLowerCase().contains(simonSays)){
                String subString = line.toLowerCase().replace(simonSays,"");
                System.out.println(subString);
            }
        }
    }
}
