import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Homework3 {

    public static void main(String[] args) {
        // list_of_arrays();                                                                                        //Задание 1, 2
        // System.out.println(insert_0_element_to_list(list_of_arrays(), "New_color"));                             //Задание 3
        // get_el_by_index(list_of_arrays());                                                                       //Задание 4
        // changing_el_by_index(list_of_arrays());                                                                  //Задание 5
        // deleting_third_el(list_of_arrays());                                                                     //Задание 6
        // searching_for_el_in_array(list_of_arrays());                                                             //Задание 7
        // sorting_of_list(list_of_arrays());                                                                       //Задание 8
        // copy_of_lists(list_of_arrays());                                                                         //Задание 9
    }

    // Задание 1
    public static List list_of_arrays() {
        List<String> lst = new ArrayList<>();
        lst.add("Orange");
        lst.add("Blue");
        lst.add("Black");
        lst.add("Green");
        lst.add("Arctic");

        // System.out.println(lst);

        // Задание 2
        for (int i = 0; i < lst.size(); i++) {
            lst.set(i, lst.get(i) + "!");

        }
        // System.out.println(lst);
        return lst;
    }

    // Задание 3
    public static List insert_0_element_to_list(List lst_of_clrs, String name_of_first_el) {

        lst_of_clrs.add(0, name_of_first_el);

        return lst_of_clrs;

    }

    // Задание 4
    public static void get_el_by_index(List lst_of_clrs) {

        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите_индекс: ");
            int index = in.nextInt();
            if (index >= 0 && index < lst_of_clrs.size()) {
                System.out.print("Искомый_элемент: " + lst_of_clrs.get(index));
            } else {
                System.out.println("Такого_индекса_нет!");
            }

        } catch (Exception e) {
            System.out.println("Вы_ввели_какую-то_глупость!");
        }

    }

    // Задание 5
    public static void changing_el_by_index(List lst_of_clrs) {

        try {
            Scanner ind = new Scanner(System.in);
            System.out.print("Введите_индекс: ");
            int index = ind.nextInt();

            Scanner nw_el = new Scanner(System.in);
            System.out.print("Введите_значение_ного_элемента: ");
            String new_element = nw_el.nextLine();

            if (index >= 0 && index < lst_of_clrs.size()) {
                lst_of_clrs.set(index, new_element);
                System.out.print("Новый список: \n" + lst_of_clrs);
            } else {
                System.out.println("Такого_индекса_нет!");
            }

        } catch (Exception e) {
            System.out.println("Вы_ввели_какую-то_глупость!");
        }

    }

    // Задание 6
    public static void deleting_third_el(List lst_of_clrs) {
        try {
            lst_of_clrs.remove(2);
            System.out.println("Список без третего эл-та: \n" + lst_of_clrs);
        } catch (Exception e) {
            System.out.println("Такого_элемента_нет!");
        }

    }

    // Задание 7
    public static void searching_for_el_in_array(List lst_of_clrs) {
        Scanner nw_el = new Scanner(System.in);
        System.out.print("Введите_значение_искомого_элемента: ");
        String searched_element = nw_el.nextLine();

        if (lst_of_clrs.contains(searched_element)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    // Задание 8
    public static void sorting_of_list(List lst_of_clrs) {
        Scanner ind = new Scanner(System.in);
        System.out.print(
                "Введите_индекс_сортировки: \n 1 - Сортировка по алфавиту, 2 - Сортировка в обратном порядке, 3 - Сортировка по алфавиту в обратном порядке: ");
        int sort_type = ind.nextInt();

        if (sort_type == 1) {
            Collections.sort(lst_of_clrs);
            System.out.println(lst_of_clrs);
        } else if (sort_type == 2) {
            Collections.reverse(lst_of_clrs);
            System.out.println(lst_of_clrs);
        } else if (sort_type == 3) {

            Collections.sort(lst_of_clrs);
            Collections.reverse(lst_of_clrs);
            System.out.println(lst_of_clrs);
        } else {
            System.out.println("Нет такого режима!");
        }

    }

    // Задание 9
    public static void copy_of_lists(List lst_of_clrs) {

        List<String> lst_of_clrs_2 = new ArrayList<>();
        List<String> lst_of_clrs_3 = new ArrayList<>(Arrays.asList("Синий", "Красный"));

        lst_of_clrs_2.addAll(lst_of_clrs);
        lst_of_clrs_3.addAll(lst_of_clrs);

        System.out.println("Старый лист: " + lst_of_clrs);
        System.out.println("Новый лист: " + lst_of_clrs_2);
        System.out.println("Новый лист 3: " + lst_of_clrs_3);

    }

}