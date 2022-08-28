import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.plaf.multi.MultiListUI;

/**
 * Homework4
 */
public class Homework4 {

    public static void main(String[] args) {
        
        long start = System.currentTimeMillis();
        LinkedList second_link_list = filling_linked_list();
        //filling_linked_list(); // Задание 1,2
        deleting_first_second_el(second_link_list); // Задание3
        long end = System.currentTimeMillis();
        // deleting_first_second_of_all_list(second_link_list); //Задание 4
        System.out.println("Время исполнения п 2-3 LinkedList: " + (end - start)); // Задание 5

        start = System.currentTimeMillis();
        ArrayList second_arrayl_list = filling_array_list();
        //filling_array_list();
        deleting_first_second_el_arraylist(second_arrayl_list);
        end = System.currentTimeMillis();
        System.out.println("Время исполнения п 2-3 ArrayList: " + (end - start));
        
    }

    // Ф-ия рандома
    public static Integer new_random() {
        int diap = 2049;
        Double chislo = (Math.random() * diap) - 1024;

        return chislo.intValue();
    }

    // Заполнение LinkedLista 10000 символов > 0, оптимизация: проход за один цикл
    public static LinkedList filling_linked_list() {

        LinkedList<Integer> new_link_list = new LinkedList<>();

        for (int i = 0; i < 100000; i++) {
            int a = new_random();

            if (a >= 0) {
                new_link_list.add(a);
            }

        }
        return new_link_list;
    }

    // Заполнение ArrayLista 10000 символов > 0, оптимизация: проход за один цикл

    public static ArrayList filling_array_list() {

        ArrayList<Integer> new_array_list = new ArrayList();

        for (int i = 0; i < 100000; i++) {
            int a = new_random();
            System.out.println(a);;

            if (a >= 0) {
                new_array_list.add(a);
            }

        }
        return new_array_list;
    }

    // Реализация п.3 с LinkedList
    public static LinkedList deleting_first_second_el(LinkedList new_link_list) {

        Integer first_el = (int) new_link_list.get(0);
        Integer second_el = (int) new_link_list.get(1);
        Integer result_el = first_el + second_el;

        new_link_list.remove(0);
        new_link_list.remove(0);

        new_link_list.add(0, result_el);

        return new_link_list;
    }

    // Реализация п.3 с ArrayList
    public static ArrayList deleting_first_second_el_arraylist(ArrayList new_array_list) {

        Integer first_el = (int) new_array_list.get(0);
        Integer second_el = (int) new_array_list.get(1);
        Integer result_el = first_el + second_el;

        new_array_list.remove(0);
        new_array_list.remove(0);

        new_array_list.add(0, result_el);

        return new_array_list;
    }

    // Реализация п.4 с ArrayList
    public static ArrayList deleting_first_second_of_all_arraylist(ArrayList new_array_list) {

        while (new_array_list.size() > 1) {

            Integer first_el = (int) new_array_list.get(0);
            Integer second_el = (int) new_array_list.get(1);
            Integer result_el = first_el + second_el;

            new_array_list.remove(0);
            new_array_list.remove(0);

            new_array_list.add(0, result_el);
        }

        return new_array_list;
    }

    // Реализация п.4 с LinkedList
    public static LinkedList deleting_first_second_of_all_list(LinkedList new_link_list) {

        while (new_link_list.size() > 1) {

            Integer first_el = (int) new_link_list.get(0);
            Integer second_el = (int) new_link_list.get(1);
            Integer result_el = first_el + second_el;

            new_link_list.remove(0);
            new_link_list.remove(0);

            new_link_list.add(0, result_el);
        }

        return new_link_list;
    }
}