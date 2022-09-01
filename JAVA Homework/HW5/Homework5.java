import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * Homework5
 */
public class Homework5 {
    public static void main(String[] args) {
        // System.out.println(filling_hashmap());
        // System.out.println(adding_to_map(filling_hashmap()));
        // System.out.println(task_6(filling_hashmap()));
        
        System.out.println(task_7(filling_hashmap()));
    }

    public static HashMap filling_hashmap() { // Задание 1,2
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < 11; i++) {
            map.put("Author " + i, "New Book " + i);
        }
        return map;
    }

    public static HashMap adding_to_map(HashMap<String, String> map) {

        for (int i = 0; i < map.size(); i++) { // Задание 3
            String key_author = "Author " + i;
            map.compute(key_author, (k, v) -> v = v + "!");
        }
        Scanner new_key = new Scanner(System.in); // Задание 4,5
        System.out.print("Введите автора: ");
        String author = new_key.nextLine();

        if (map.containsKey(author)) {
            String[] val = map.get(author).split(" ");
            String new_val = "";
            for (int i = 1; i < val.length; i++) {
                new_val = new_val + " " + val[i];
            }
            map.put(author, new_val);

        } else {
            Scanner new_value = new Scanner(System.in);
            System.out.print("Введите книгу: ");
            String book = new_value.nextLine();
            map.put(author, book);
        }

        return map;

    }

    public static HashMap task_6(HashMap<String, String> map) { // Задание 6
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> new_map = iterator.next();
            map.put(new_map.getKey(), new_map.getValue() + "!");
        }

        return map;
    }
    public static HashMap task_7(HashMap<String, String> map) { //Задание 7, почему не работает?

        map.forEach((k, v) -> v = v + " !");
        return map;
    }
}