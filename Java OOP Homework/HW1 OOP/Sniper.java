import java.util.List;
import java.util.Random;

public class Sniper extends BaseHero {

    public Sniper(List<BaseHero> side, int y, int x) {
        super(side);
        super.setName("Sniper");
        super.setAttack(12);
        super.setDefence(10);
        super.setShots(32);
        super.setDamage(8, 10);
        super.setHealth(15);
        super.setSpeed(9);
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

        } else if (this.getHealth() > 15) {
            this.setHealth(15);
        }
        return super.checkstate();
    }
}
