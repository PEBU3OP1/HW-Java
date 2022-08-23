import java.util.List;

public class task2 {

    public static void main(String[] args) {
        // System.out.println( str_rotation("twist" , "tsiwt"));
        // System.out.println(str_recursion_rotation("acdsasdsa"));
        //System.out.println(strng_bldr(3, 4));
        //System.out.println(strbldr_insert_delete(strng_bldr(3, 4)));
        //System.out.println(strbldr_replace(strng_bldr(5, 6)));
        Long start1 = System.currentTimeMillis();
        strbldr_replace (big_str(strng_bldr(5, 6)));
        Long end1 = System.currentTimeMillis();
        System.out.println(end1 -start1);
                                                        // Решение задачи 7 не закоммент, за счет рекурсии StringBuilder гораздо дольше)
        Long start2 = System.currentTimeMillis();
        str_replace(big_str(strng_bldr(5, 6)));
        Long end2 = System.currentTimeMillis();
        System.out.println(end2 -start2);
    }
// Задача 2
    public static String str_rotation(String str_1, String str_2) {     
        if (new StringBuilder(str_2).reverse().toString().equals(str_1)) {
            return "yes";
        }
        return "no";
    }
// Задача 3
    public static String str_recursion_rotation(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return str_recursion_rotation(str.substring(1)) + str.charAt(0);
    }
// Задача 4
    public static String strng_bldr (int a, int b) {
        StringBuilder result = new StringBuilder();
        result.append((a + " + " + b + " = " + (a + b)) + "\n" + (a + " - " + b + " = " + (a - b)) + "\n"
                + (a + " * " + b + " = " + (a * b))+ "\n");

        return result.toString();

    }

// Задача 5
    public static String strbldr_insert_delete (String str) {
        StringBuilder new_str = new StringBuilder(str);
            if (str.lastIndexOf("=") == -1) {
                return new_str.toString();
            }

           
            new_str.deleteCharAt(str.lastIndexOf("="));
            new_str.insert(str.lastIndexOf("="), "равно");
            str = new_str.toString();

            return strbldr_insert_delete(str);
        
    }
// Задача 6
    public static String strbldr_replace (String str) {
        StringBuilder new_str = new StringBuilder(str);
            if (str.lastIndexOf("=") == -1) {
                return new_str.toString();
            }

           
            new_str.replace(str.lastIndexOf("="), str.lastIndexOf("=")+1, "равно");
            str = new_str.toString();

            return strbldr_replace(str);
        
    }

    public static String big_str( String str) {
        for (int i = 0; i < 10; i++) {
            str = str + str;
        }
        
        return str;
    }

    public static String str_replace(String str) {
        str = str.replace("=", "равно");

    return str;
    }
}