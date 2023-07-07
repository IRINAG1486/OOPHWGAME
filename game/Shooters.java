package game;
import java.util.ArrayList;

public abstract class Shooters extends Unit {
    public int firing_range; //дальность стрельбы
    public int arrays;
    
    
    public Shooters(String name, int strength, int speed, int sleight, int stamina, int determination, int defense, int vulnerability, int damage, int x, int y, int firing_range, int arrays){
        super(name, strength, speed, sleight, stamina, determination, defense, vulnerability, damage, x, y);
        this.firing_range = firing_range;
        this.arrays = arrays;
    
}

public int doShootingFight(){ // стрелковый бой
    return damage;
}
@Override

    public void step(ArrayList <Unit> list1, ArrayList <Unit> list2) {
        if (getStrength() == 0 || arrays == 0) {
            return;
        }
        Unit currentEnemy = findClosestEnemy(list1);
        doAttack(currentEnemy);
        if(list2.contains(Countryman.class)){
            return;
        }
        arrays--;
        
}

public String getInfo(){
    return super.getInfo() + arrays;
}


}
