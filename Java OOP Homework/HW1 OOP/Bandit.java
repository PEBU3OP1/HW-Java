import java.util.List;
import java.util.Random;

public class Bandit extends BaseHero {

    public Bandit(List<BaseHero> side, int x, int y) {
        super(side);
        super.setName("Bandit");
        super.setAttack(8);
        super.setDefence(3);
        super.setShots(0);
        super.setDamage(2, 4);
        super.setHealth(10);
        super.setSpeed(6);
        super.setDelivery(false);
        super.setMagic(false);
        super.setStatus("-");
        super.setPos(x, y);
        
    }

    @Override
    public String step() {
        Random rnd = new Random();
        int strike_rnd = rnd.nextInt(2);
        int res_rnd = rnd.nextInt(super.getlist().size());
        super.getlist().get(res_rnd).setHealth((super.getlist().get(res_rnd).getHealth() - this.getDamage(strike_rnd)));
        super.setStatus(String.valueOf(res_rnd));
        
        String result = super.getlist().get(res_rnd).getName();
        return result;
    }

}
