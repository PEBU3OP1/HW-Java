import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class homework2_java {

    public static void main(String[] args) {

        finding_min_entry("this is a test string", "tist");
    }

    public static String finding_min_entry(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();

        int[] term_str2 = new int[256];
        int[] term_str1 = new int[256];

        for (int i = 0; i < len2; i++) {
            term_str2[str2.charAt(i)]++;
        }

        int count = 0;
        int start = 0;
        int min_len = 1000000;
        int start_indx = -1;

        for (int j = 0; j < len1; j++) {
            term_str1[str1.charAt(j)]++;

            if (term_str1[str1.charAt(j)] <= term_str2[str1.charAt(j)]) {
                count++;
            }

            if (count == len2) {
                while (term_str1[str1.charAt(start)] > term_str2[str1.charAt(start)]
                        || term_str2[str1.charAt(start)] == 0) {
                    if (term_str1[str1.charAt(start)] > term_str2[str1.charAt(start)]) {
                        term_str1[str1.charAt(start)]--;
                    }

                    start++;
                }

                int wnd_len = j - start + 1;

                if (min_len > wnd_len) {
                    min_len = wnd_len;
                    start_indx = start;
                }
            }    
        }

        if (start_indx == -1) {
            System.out.println("Окна нет!");
            return "";
        }
        System.out.println(str1.substring(start_indx, start_indx + min_len));
        return str1.substring(start_indx, start_indx + min_len);
    }
    
}
