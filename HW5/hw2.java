package HW5;

import java.util.*;

public class hw2 {
    public static void main(String[] args) {
        Map<String, Integer> nameMap = new HashMap<>();
        String employees = "Иван Иванов " +
                "Светлана Петрова " +
                "Кристина Белова " +
                "Анна Мусина " +
                "Анна Крутова " +
                "Иван Юрин " +
        String[] noRepeat = employees.split(" ");
        for (int i = 0; i < noRepeat.length; i += 2) {
            if (nameMap.containsKey(noRepeat[i])) {
                nameMap.replace(noRepeat[i], nameMap.get(noRepeat[i]) + 1);
            } else {
                nameMap.put(noRepeat[i], 1);
            }
        }
        System.out.println(nameMap);
        Map<String, Integer> sortedNameMap = new LinkedHashMap<>();
        int max = 1;
        for (int value : nameMap.values()) {
            if (value > max) {
                max = value;
            }
        }
        for (int i = max; i > 0; i--) {
            for (Map.Entry<String, Integer> entry : nameMap.entrySet()) {
                String key = entry.getKey();
                if (nameMap.get(key) == i) {
                    sortedNameMap.put(key, nameMap.get(key));
                }
            }
        }
        System.out.println(sortedNameMap);
    }
}
