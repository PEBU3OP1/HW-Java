import java.io.*;
import java.util.ArrayList;


public class HW1 {

    public static long new_rnd() {
            
          
        long max = Integer.MAX_VALUE;
        long min = Integer.MIN_VALUE;
        long diap = (long) (max - min + 1);
        long i = (long) (Math.random()*diap) - max;
        i = Math.abs(i);
        return i;
    }

    public static long bit_offset (long a, int count){ //Рекурсия по поиску бита
                
        if (a == 0) {
            return count;
        }
        a = a >>1;
        count ++;
        return bit_offset(a, count);
    }

    public static int srching_bit(long a, int count){   // Обычный метод по поиску бита
            while (a !=0) {
                a = a >> 1;
                count ++;
            }
        return count;
        
    }


    

    public static void main(String[] args) throws IOException {    
        
        int count = (int) bit_offset(new_rnd(),0);
        long j = (long) new_rnd();
         
        ArrayList m1 = new ArrayList<>();
        ArrayList m2 = new ArrayList<>();
         
        for (int k = 0; k < Integer.MAX_VALUE; k++) {
            if (k > j && k % count == 0){  
                
                m1.add(k);
            }
            else if (k < j && k % count == 1){
                m2.add(k);
            }
            }
                
        
        

         
        File file = new File ("new.txt");
        file.createNewFile();

        FileWriter writer = new FileWriter(file);
        writer.write("i равно : " + j + "\n");
        writer.write("Старший бит : " + count + "\n");
        writer.write("Массив m1: ");
        for (int f = 0; f < m1.size(); f++) {
            writer.write(m1.get(f) + ", ");
            
        }
        writer.write("\n");
        writer.write("Массив m2: ");
        for (int g = 0; g < m2.size(); g++) {
            writer.write(m2.get(g) + ", ");
            
        }

        writer.flush();
        writer.close();       

    }

}
