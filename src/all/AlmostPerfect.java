import java.util.Scanner;

public class AlmostPerfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int number = sc.nextInt();
            int total = 0;
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    total += i;
                }
            }
            if (total == number) {
                System.out.println(number + " perfect");
            } else if (number - total <= 2) {
                System.out.println(number + " almost perfect");
            } else {
                System.out.println(number + " not perfect");
            }
        }
    }
}

// TODO optimize algorithm