import java.util.Scanner;

public class Oddities {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        while(sc.hasNext()){
            int number = sc.nextInt();
            if (number % 2 == 0){
                System.out.println(number + " is even");
            } else {
                System.out.println(number + " is odd");
            }
        }
    }
}


