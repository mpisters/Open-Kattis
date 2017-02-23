import java.util.*;
public class AddingWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<String, Integer>();
        Map<Integer, String> map2 = new HashMap<Integer, String>();
        while (sc.hasNextLine()) {
            LinkedList<String> list = new LinkedList<>();
            String line = sc.nextLine();
            String[] parts = line.split(" ");
            for (int i =0; i < parts.length; i++){
                list.add(parts[i]);
            }
            Iterator<String> i = list.iterator();
            String item = i.next();
            int total = 0;
            String unknown = "";
            String symbol = "";
            int count = 0;
            while(i.hasNext()){
                switch (item) {
                    case "def":
                        String key = i.next();
                        int value = Integer.parseInt(i.next());
                        map.put(key, value);
                        map2.put(value, key);
                        break;
                    case "clear":
                        map.clear();
                        map2.clear();
                        i.next();
                        break;
                    case "calc":
                        String word = i.next();
                        if (word.equals("+") || word.equals("-")){
                            symbol = word;
                        }
                        if (word.length() > 1 && map.containsKey(word) && !unknown.equals("unknown")) {
                            if (symbol.equals("+") || count == 0) {
                                total += map.get(word);

                            } else {
                                total -= map.get(word);
                            }
                        } else if (!map.containsKey(word) && !unknown.equals("unknown") && word.length() > 1){
                            unknown += "unknown";
                        }
                        count++;
                        if (word.equals("=")){
                            String answer = "";
                            if (!unknown.equals("unknown") && map2.containsKey(total)){
                                answer += map2.get(total);
                            } else {
                                answer += "unknown";
                            }
                            list.removeFirst();
                            System.out.println(String.join(" ", list) + " " + answer);
                            total = 0;
                            unknown = "";
                        }
                        break;
                }
            }
        }
    }

}