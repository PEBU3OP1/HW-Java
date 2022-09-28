import java.util.List;
import java.util.Random;

public class Spearman extends BaseHero{

    public Spearman(List<BaseHero> side, int y, int x){
        super(side);
        super.setName("Spearman");
        super.setAttack(4);
        super.setDefence(5);
        super.setShots(0);
        super.setDamage(1, 3);
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

        int enemy_x = 0, enemy_y = 0;
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
                        shortest_way = term_shortest_way;
                        enemy_x = super.getlist().get(i).getPosX();
                        enemy_y = super.getlist().get(i).getPosY();
                        enemy_index = i; // получаем индекс ближ врага для атаки
                    }
                }

            }
            int qty_of_steps = this.getSpeed();

            if (shortest_way == 1) {
                hit(enemy_index);
            }

            else {
                while (qty_of_steps > 0) {
                    if (enemy_x - this.getPosX() > 1) {
                        if (enemy_y - this.getPosY() == 0) {
                            this.setPos(this.getPosX() + 1, this.getPosY());
                        }
                        
                    }
                    if (enemy_x - this.getPosX() < -1) {
                        if (enemy_y - this.getPosY() == 0) {
                            this.setPos(this.getPosX() - 1, this.getPosY());
                        }
                    }
                    if (Math.abs(enemy_x - this.getPosX()) == 1) {
                        if (enemy_y - this.getPosY() == 0) {
                            break;
                        } else {
                            if (enemy_y - this.getPosY() > 0) {
                                this.setPos(this.getPosX() , this.getPosY()+ 1);
                            }
                            if (enemy_y - this.getPosY() < 0) {
                                this.setPos(this.getPosX() , this.getPosY()- 1);
                            }
                            qty_of_steps--;
                        }
                    }

                    qty_of_steps--;
                }

            }
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

    @Override
    public float hit(int enemy_index) {
        float res = 0;
        Random rnd = new Random();
        int strike_rnd = rnd.nextInt(2);

        super.getlist().get(enemy_index)
                .setHealth((super.getlist().get(enemy_index).getHealth() - this.getDamage(strike_rnd)));
        super.setStatus(String.valueOf(enemy_index));

       
        return res;
    }

}
