public class Crossbowman {
    private String name;
    private int attack;
    private int defence;
    private int shots;
    private int [] damage = new int[2];
    private int health;
    private int speed;
    private static boolean delivery = false;
    private static boolean magic = false;

    public Crossbowman(){
        name = "Crossbowman";
        attack = 6;
        defence = 3;
        shots = 16;
        damage[0] = 2;damage[1] = 3;
        health = 10;
        speed = 4;
        
    }



    
}
