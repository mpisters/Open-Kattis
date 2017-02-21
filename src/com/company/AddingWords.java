package com.company;
import java.util.*;
public class AddingWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<String, Integer>();
        Map<Integer, String> map2 = new HashMap<Integer, String>();
        while (sc.hasNextLine()) {
            String cards = sc.nextLine();
            String[] parts = cards.split(" ");
            if (parts[0].equals("def")) {
                map.put(parts[1], Integer.parseInt(parts[2]));
                map2.put(Integer.parseInt(parts[2]), parts[1]);
            }
            if (parts[0].equals("calc")){
                int prev = 0;
                int curr = 0;
                boolean isString = false;
                for (int i = 1; i < parts.length; i++){
                    String item = parts[i];
                    if (!isString && !item.equals("+") && !item.equals("-") && !item.equals("=")){
                        prev = map.containsKey(item) ? map.get(item) : -10000;
                    }
                    if (isString){
                        isString = false;
                        String nextItem = parts[i];
                        curr = map.containsKey(nextItem) ? map.get(nextItem) : -10000;
                        if (parts[i -1].equals("+")) {
                            prev = curr != -10000 && prev != -10000 ? prev + curr : -10000;
                        }
                        else{
                            prev = curr != -10000 && prev != -10000 ? prev - curr : -10000;
                        }

                    }
                    if (item.equals("+")){
                        isString = true;
                    }
                    if (item.equals("-")){
                        isString = true;
                    }
                    if (item.equals("=")){
                        String answer = map2.containsKey(prev) ? map2.get(prev) : "unknown";
                        String result = "";
                        for (int j = 1; j < parts.length; j++) {
                            String word = parts[j];
                            result = result + word + " ";

                        }
                        System.out.println(result + answer);
                    }
                }
            }
            if (parts[0].equals("clear")){
                map.clear();
                map2.clear();
            }
        }
    }
}