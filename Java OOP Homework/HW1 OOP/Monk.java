public class Monk {
    private String name;
    private int attack;
    private int defence;
    private int shots;
    private int damage;
    private int health;
    private int speed;
    private static boolean delivery = false;
    private static boolean magic = true;

    public Monk(){
        name = "Monk";
        attack = 12;
        defence = 7;
        shots = 0;
        damage = -4;
        health = 30;
        speed = 5;
        
    }

    public Monk(String name){
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
    public int getDamage(){
        return this.damage;
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
        
        return String.format("Имя: %s, Атака: %d, Защита: %d, Выстрелы: %d, Урон: %d, Здоровье: %d, Скорость: %d, Доставка: %s, Магия: %s", name, attack, defence, shots, damage, health, speed, delivery, magic);
    }

    
}
