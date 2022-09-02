import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Homework6
 */
public class Homework6 {

    public static void main(String[] args) {
        //task_1_2_3_4();
        //task_5_comparator_ts();
        //task_6_comparator_tm();
    }

    public static void task_1_2_3_4() { //Задание 1, 2, 3, 4

        HashSet<Integer> hs = new HashSet<>();
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        TreeSet<Integer> ts = new TreeSet<>();

        for (int i = 0; i < 11; i++) {
            hs.add(new Random().nextInt(100));
            lhs.add(new Random().nextInt(100));
            ts.add(new Random().nextInt(100));
        }

        System.out.println(hs);
        System.out.println(lhs);
        System.out.println(ts);
 
        hs.forEach((k) -> {
            if (lhs.contains(k)) {
                lhs.remove(k);
            }
        });

        lhs.forEach((k1) -> {
        if (!ts.contains(k1)) {
            ts.add(k1);
        }
        });

        System.out.println();
        System.out.println(hs);
        System.out.println(lhs);
        System.out.println(ts);
    }

    public static void task_5_comparator_ts() { //Задание 5

        TreeSet <Integer> ts1 = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare (Integer integer, Integer t1){
                if (t1%2 == 0) return -1;
                else if (t1 == integer) return 0;
                else return 1;
            }
        });

        for (int i = 0; i < 16; i++) {
            ts1.add(new Random().nextInt(10));
        }
        System.out.println(ts1);
    }

    public static void task_6_comparator_tm() { //Задание 6

        TreeMap <Integer, String> tm = new TreeMap<>(new Comparator <Integer>() {
            @Override
            public int compare (Integer integer, Integer t1){
                if (t1%2 == 0) return -1;
                else if (t1 == integer) return 0;
                else return 1;
            }
        });

        for (int i = 0; i < 16; i++) {
            tm.put(new Random().nextInt(10), "");
        }
        System.out.println(tm);
    }
}
