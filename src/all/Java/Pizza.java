import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pizza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while(sc.hasNextInt()){
            int number = sc.nextInt();
            DecimalFormat numberFormat = new DecimalFormat("#.000000");
            list.add(number);
            if (list.size() == 2) {
                double cheeseRadius = list.get(0) - list.get(1);
                double pizza = list.get(0) * list.get(0) * Math.PI;
                double cheese = cheeseRadius * cheeseRadius * Math.PI;
                double result = cheese / pizza * 100;
                System.out.println(numberFormat.format(result));
            }

        }

    }

}
