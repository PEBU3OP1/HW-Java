public class Sniper {
    private String name;
    private int attack;
    private int defence;
    private int shots;
    private int [] damage = new int[2];
    private int health;
    private int speed;
    private static boolean delivery = false;
    private static boolean magic = false;

    public Sniper(){
        name = "Sniper";
        attack = 12;
        defence = 10;
        shots = 32;
        damage[0] = 8;damage[1] = 10;
        health = 15;
        speed = 9;
        
    }



    
}
