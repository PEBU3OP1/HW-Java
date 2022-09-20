import java.util.List;
import java.util.Random;

public class Spearman extends BaseHero{

    public Spearman(List<BaseHero> side, int x, int y){
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
