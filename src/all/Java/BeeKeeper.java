import java.util.*;

public class BeeKeeper{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Map<Integer, String> dict = new HashMap<Integer, String>();
            int total = 0;
            while (true) {
                int number = sc.nextInt();
                if (number == 0){
                    break;
                }
                for (int i = 0; i < number; i++){
                    String word = sc.next();
                    total = CountingVowels(word);
                    dict.put(total, word);
                }
                String mostVowels = HighestTotalvowels(dict);
                System.out.println(mostVowels);
                dict.clear();
            }
        }

        public static int CountingVowels(String word){
                int totalDoubles = 0;
                for (int i = 0; i < word.length(); i++) {
                    if (i != (word.length() - 1)) {
                        char letter = word.charAt(i);
                        char secondLetter = word.charAt(i + 1);
                        if (letter == 'e' && secondLetter == 'e') {
                            totalDoubles++;
                        }
                        if (letter == 'o' && secondLetter == 'o') {
                            totalDoubles++;
                        }
                        if (letter == 'u' && secondLetter == 'u') {
                            totalDoubles++;
                        }
                        if (letter == 'i' && secondLetter == 'i') {
                            totalDoubles++;
                        }
                        if (letter == 'a' && secondLetter == 'a') {
                            totalDoubles++;
                        }
                    }
                }
                return totalDoubles;
            }

        public static String HighestTotalvowels(Map<Integer, String> dict) {
            Set<Integer> keys = dict.keySet();
            List<Integer> listKeys = new ArrayList<Integer>(keys);
            if (listKeys.size() > 0) {
                int lastItemIndex = listKeys.size() - 1;
                String lastItem = dict.get(lastItemIndex);
                return lastItem;
            }
            return "-";
        }
}