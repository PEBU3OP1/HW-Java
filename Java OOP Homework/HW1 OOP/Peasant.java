import java.util.List;
import java.util.Random;

public class Peasant extends BaseHero {
    public Peasant(List<BaseHero> side, int x, int y) {
        super(side);
        super.setName("Peasant");
        super.setAttack(1);
        super.setDefence(1);
        super.setShots(0);
        super.setDamage(1);
        super.setHealth(1);
        super.setSpeed(3);
        super.setDelivery(true);
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
