package Sem5_HashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
    ex_0();

    }

    static void ex_0(){
        Map<String, String> employeeMap = new LinkedHashMap<>(20);
        // Если создать HashMap - неотсортироанный МАР
        // Если создать LinkedHasdMap - получим отсортированныфй МАР
        // Если создать TreeMap - получим МАР с отсортированными по возрастанию ключами
        employeeMap.put("1234", "Иванов");
        employeeMap.put("1434", "Петров");
        employeeMap.put("3434", "Романцев");
        employeeMap.put("5467", "Князев");

        System.out.println(employeeMap);
        System.out.println(employeeMap.keySet());
        System.out.println(employeeMap.get("1234"));

//        Set<String> keySet = employeeMap.keySet();
//        System.out.println(keySet);

        for (String key:employeeMap.keySet()) {
            System.out.printf("%s\t->\t%s%n", key, employeeMap.get(key));
        }

        var entrySet = employeeMap.entrySet();
        System.out.println(entrySet);

        for (Map.Entry<String, String> s:employeeMap.entrySet()) {
            System.out.printf("%s\t->\t%s%n", s.getKey(), s.getValue());
        }
        System.out.println();

        employeeMap.forEach((key, value) -> System.out.printf("%s\t->\t%s%n", key, value));

        Map<Integer, String> testMap = Map.of(
          12, "A",
          47, "B",
          7,  "C"
        );
        Map<Integer, String> testMap1 = Map.ofEntries(
                Map.entry(12, "A"),
                Map.entry(47, "B"),
                Map.entry(7,  "C")
        );
    }

    static void ex_1(){
//        Написать метод, который переведет число из римского формата записи в арабский.
//        Например, MMXXII = 2022



    }
}
