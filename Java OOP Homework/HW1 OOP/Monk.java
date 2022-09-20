import java.util.List;
import java.util.Random;

public class Monk extends BaseHero {

    public Monk(List<BaseHero> side, int x, int y){
        super(side);
        super.setName("Monk");
        super.setAttack(12);
        super.setDefence(7);
        super.setShots(0);
        super.setDamage(-4);
        super.setHealth(30);
        super.setSpeed(5);
        super.setDelivery(false);
        super.setMagic(true);
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
