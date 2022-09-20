import java.util.List;
import java.util.Random;

public class Crossbowman extends BaseHero {

    public Crossbowman(List<BaseHero> side, int x, int y) {
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
    }

    @Override
    public String step() {
        Random rnd = new Random();
        int res_rnd = rnd.nextInt(super.getlist().size());
        super.getlist().get(res_rnd).setHealth((super.getlist().get(res_rnd).getHealth() - this.getDamage_int()));
        super.setStatus(String.valueOf(res_rnd));
       
        String result = super.getlist().get(res_rnd).getName();
        return result;
    }
}
