import java.util.List;
import java.util.Random;

public class Peasant extends BaseHero {
    public Peasant(List<BaseHero> side, int y, int x) {
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
        super.setState("Alive");
    }

    @Override
    public String step() {
        
        int shortest_way = 10;
        if (!this.getState().equals("DEAD")) {

            for (int i = 0; i < super.getlist().size(); i++) {
                if (super.getlist().get(i).getState().equals("DEAD")) {
                    continue;
                } else if (super.getlist().get(i).getName().equals("Crossbowman")||
                super.getlist().get(i).getName().equals("Sniper")) {
                    super.getlist().get(i).setShots((super.getlist().get(i).getShots() + 1));
                    super.setStatus(String.valueOf(i));
                    
                } 
                
                
            }
        }

        
    return null;
    }    

    

    @Override
    public String checkstate() {
        
        if (this.getHealth() <= 0) {
            this.setState("DEAD");
            this.setName("X");
    
        }
        else if (this.getHealth() > 1) {
            this.setHealth(1);
        }
        return super.checkstate();
    }

}