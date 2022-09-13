public class Bandit {
    private String name;
    private int attack;
    private int defence;
    private int shots;
    private int [] damage = new int[2];
    private int health;
    private int speed;
    private static boolean delivery = false;
    private static boolean magic = false;

    public Bandit(){
        name = "Bandit";
        attack = 8;
        defence = 3;
        shots = 0;
        damage[0] = 2;damage[1] = 4;
        health = 1;
        speed = 3;
        
    }


}
