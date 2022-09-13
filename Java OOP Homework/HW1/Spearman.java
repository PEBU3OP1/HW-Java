public class Spearman {
    private String name;
    private int attack;
    private int defence;
    private int shots;
    private int [] damage = new int[2];
    private int health;
    private int speed;
    private static boolean delivery = false;
    private static boolean magic = false;

    public Spearman(){
        name = "Spearman";
        attack = 4;
        defence = 5;
        shots = 32;
        damage[0] = 1;damage[1] = 3;
        health = 10;
        speed = 4;
        
    }



    
}
