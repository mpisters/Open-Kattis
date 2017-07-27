import javax.print.DocFlavor;
import java.util.*;

/**
 * Created by miche on 27-7-2017.
 */
public class BaconEggsAndSpam {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<String, ArrayList<String>> report = new HashMap<>();
        while(true){
            int n = sc.nextInt();
            if (n == 0){
                break;
            }
            sc.nextLine();
            String[] strAr = new String[n];
            for (int i = 0; i <  n; i++){
                strAr[i] = sc.nextLine();
            }
            for (int j = 0; j < strAr.length; j++){
                String[] order = strAr[j].split(" ");
                String person = order[0];
                ArrayList<String> persons;
                for (int l = 1; l < order.length; l++){
                    String item = order[l];
                    persons = report.get(item);
                    if(persons == null){
                        persons = new ArrayList<>();
                        persons.add(person);
                        report.put(item, persons);
                    } else {
                        persons.add(person);
                        report.put(item, persons);
                    }

                }
            }
            for (String key: report.keySet()){
                String customers = report.get(key).toString().replace(",", "").replace("[", "").replace("]", "").trim();
                System.out.println(key + " " + customers);
            }
            System.out.println();
            report.clear();


        }
    }
}
