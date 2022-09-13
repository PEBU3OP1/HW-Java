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

    public Bandit(String name){
        this();
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public int getAttack(){
        return this.attack;
    }
    public int getDeffence(){
        return this.defence;
    }
    public int getShots(){
        return this.shots;
    }
    public String getDamage(){
        return String.format("%d - %d", damage[0], damage[1]);
    }
    public int getHealth(){
        return this.health;
    }
    public int getSpeed(){
        return this.speed;
    }
    public static boolean getDelivery(){
        return delivery;
    }
    public static boolean getMagic(){
        return magic;
    }

    public String getAllCharact(){
        
        return String.format("Имя: %s, Атака: %d, Защита: %d, Выстрелы: %d, Урон: %d - %d, Здоровье: %d, Скорость: %d, Доставка: %s, Магия: %s", name, attack, defence, shots, damage[0], damage[1], health, speed, delivery, magic);
    }

}
