import java.util.List;

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
    private List<BaseHero> list;
    private String state;
    private String status;
    private Moves pos;
    private String side_str;

    public BaseHero() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getAttack() {
        return this.attack;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getDeffence() {
        return this.defence;
    }

    public void setShots(int shots) {
        this.shots = shots;
    }

    public int getShots() {
        return this.shots;
    }

    public void setDamage(int damage1, int damage2) {
        this.damage[0] = damage1;
        this.damage[1] = damage2;
    }

    public void setDamage(int damage) {
        this.damage[1] = damage;
    }

    public String getDamage() {
        return String.format("%d - %d", damage[0], damage[1]);
    }

    public int getDamage(int strike) {
        return damage[strike];
    }

    public int getDamage_int() {
        return this.damage[1];
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return this.health;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setDelivery(boolean delivery) {
        this.delivery = delivery;
    }

    public boolean getDelivery() {
        return this.delivery;
    }

    public void setMagic(boolean magic) {
        this.magic = magic;
    }

    public boolean getMagic() {
        return this.magic;
    }

    public List<BaseHero> getlist() {
        return this.list;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    public void setPos(int x, int y) {
        pos = new Moves(y, x);
    }

    public int getPosX() {
        return this.pos.x;
    }

    public int getPosY() {
        return this.pos.y;
    }

    public String getSide() {
        return this.side_str;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String stat) {
        this.state = stat;
    }

    public BaseHero(List<BaseHero> side, String side_str) {
        this.list = side;
        this.side_str = side_str;
    }

    public BaseHero(List<BaseHero> side) {
        this.list = side;
    }

    @Override
    public float hit(int enemy_index) {
        // TODO Auto-generated method stub
        return 0;
    }

    

    @Override
    public boolean status() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public String checkstate() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String condition() {
        if (this.state == "DEAD") {
            return name + "; DEAD" + "; Dmg: " + damage[1] + "; Attck: " + attack + "; hit/heal: " + status
                    + "; Pos (X " + pos.x + ", Y " + pos.y + "); Shots: " + shots ;
        } else {

            return name + "; Hlth: " + health + "; Dmg: " + damage[1] + "; Attck: " + attack + "; hit/heal: " + status
                    + "; Pos (X " + pos.x + ", Y " + pos.y + "); Shots: " + shots ;
        }
    }

    @Override
    public String step() {
        return null;
    }

    public Moves shortest_way() {

        return null;
    }
}