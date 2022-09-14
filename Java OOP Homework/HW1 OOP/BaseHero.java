public abstract class BaseHero implements Actions {
    
    private String name;
    private int attack;
    private int defence;
    private int shots;
    private int[] damage = new int[2];
    private int health;
    private int speed;
    private boolean delivery;
    private boolean magic;
    
    public BaseHero() {
    }
    
    public void setName(String name) {this.name = name;}
    public String getName() {return this.name;}

    public void setAttack(int attack) {this.attack = attack;}
    public int getAttack() {return this.attack;}

    public void setDefence(int defence) {this.defence = defence;}
    public int getDeffence() {return this.defence;}

    public void setShots(int shots) {this.shots = shots;}
    public int getShots() {return this.shots;}

    public void setDamage(int damage1, int damage2) {
        this.damage[0] = damage1;
        this.damage[1] = damage2;
    }
    public void setDamage(int damage) {this.damage[1] = damage;}
    public String getDamage() {return String.format("%d - %d", damage[0], damage[1]);}



    public void setHealth(int health) {this.health = health;}
    public int getHealth() {return this.health;}

    public void setSpeed(int speed) {this.speed = speed;}
    public int getSpeed() {return this.speed;}

    public void setDelivery(boolean delivery) {this.delivery = delivery;}
    public boolean getDelivery() {return this.delivery;}

    public void setMagic(boolean magic) {this.magic = magic;}
    public boolean getMagic() {return this.magic;}


    public String getAllCharact() {

        return String.format(
                "Имя: %s, Атака: %d, Защита: %d, Выстрелы: %d, Урон: %d - %d, Здоровье: %d, Скорость: %d, Доставка: %s, Магия: %s",
                name, attack, defence, shots, damage[0], damage[1], health, speed, delivery, magic);
    }

    @Override
    public float hit() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public float get_Hit(float damage) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean status() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean changePos() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public String condition() {
        // TODO Auto-generated method stub
        return null;
    }

}