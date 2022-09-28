import java.util.List;
import java.util.Random;

public class Wizard extends BaseHero{

    public Wizard(List<BaseHero> side, int y, int x){
        super(side);
        super.setName("Wizard");
        super.setAttack(17);
        super.setDefence(12);
        super.setShots(0);
        super.setDamage(-5);
        super.setHealth(30);
        super.setSpeed(9);
        super.setDelivery(false);
        super.setMagic(true);
        super.setStatus("-");
        super.setPos(x, y);
        super.setState("Alive");
    }
    @Override
    public String step() {
        int enemy_index = 0;
        int shortest_way = 10;
        if (!this.getState().equals("DEAD")) {

            for (int i = 0; i < super.getlist().size(); i++) {
                if (super.getlist().get(i).getState().equals("DEAD")) {
                    continue;
                } else {
                    int term_shortest_way = Math.abs(super.getlist().get(i).getPosX() - this.getPosX())
                    + Math.abs(super.getlist().get(i).getPosY() - this.getPosY());
            if (term_shortest_way <= shortest_way) {
                enemy_index = i; // получаем индекс ближ врага для атаки
                }
            }
        }

        super.getlist().get(enemy_index).setHealth((super.getlist().get(enemy_index).getHealth() - this.getDamage_int()));
        super.setStatus(String.valueOf(enemy_index));
        
        
    }
        return null;
    }
    @Override
    public String checkstate() {
        
        if (this.getHealth() <= 0) {
            this.setState("DEAD");
            this.setName("X");
    
        }
        else if (this.getHealth() > 30) {
            this.setHealth(30);
        }
        return super.checkstate();
    }
}
