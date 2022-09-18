import java.util.List;
import java.util.Random;

public class Sniper extends BaseHero {
    public Sniper(List<BaseHero> side) {
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
    }

    @Override
    public String step() {
        Random rnd = new Random();
        int strike_rnd = rnd.nextInt(2);
        int res_rnd = rnd.nextInt(super.getlist().size());
        super.getlist().get(res_rnd).setHealth((super.getlist().get(res_rnd).getHealth() - this.getDamage(strike_rnd)));
        String result = super.getlist().get(res_rnd).getName();
        return result;
    }
}
