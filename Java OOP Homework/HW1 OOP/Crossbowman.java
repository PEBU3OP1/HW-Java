import java.util.List;
import java.util.Random;

public class Crossbowman extends BaseHero {

    public Crossbowman(List<BaseHero> side, int y, int x) {
        super(side);
        super.setName("Crossbowman");
        super.setAttack(6);
        super.setDefence(3);
        super.setShots(16);
        super.setDamage(2);
        super.setHealth(10);
        super.setSpeed(4);
        super.setDelivery(false);
        super.setMagic(false);
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
            Random rnd = new Random();
            int strike_rnd = rnd.nextInt(2);
            
            super.getlist().get(enemy_index)
                    .setHealth((super.getlist().get(enemy_index).getHealth() - this.getDamage(strike_rnd)));
            super.setShots(super.getShots() - 1);
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
        else if (this.getHealth() > 10) {
            this.setHealth(10);
        }
        return super.checkstate();
    }

    

}
