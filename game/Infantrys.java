package game;
import java.util.ArrayList;
public abstract class Infantrys extends Unit {

    public int mobility; //мобильность

    public Infantrys(String name, int strength, int speed, int sleight, int stamina, int determination, int defense, int vulnerability, int damage, int x,  int y, String state, int mobility){
        super(name, strength, speed, sleight, stamina, determination, defense, vulnerability, damage, x, y, state);
        this.mobility = mobility;
}

    public String getMobility(){
        return String.format("Сurrent mobility indicator: %d", mobility);
}

    public int doInfighting(){ // ближний бой
        return damage;
    }

    
    public int doStun(){ // оглушение
        return strength;
    }

    
    public int doDeflexure(){ //уклонение
        return damage;
    }

    public int doRecce(){ //разведка
        return damage;
    }

    @Override
    public void step(ArrayList <Unit> list1, ArrayList <Unit> list2) {
        int attackRange = 1;
        //System.out.println("Ходит" + " " + getInfo());
        if (getStrength() == 0 ) {
            //System.out.println(getInfo() + " израсходовал силы " + " состояние " + state);
            return;
        }
        Unit currentEnemy = findClosestEnemy(list2);
        if(currentEnemy != null){
        if(currentEnemy.coordinate.calculateDistance(coordinate) <= attackRange){
        //System.out.println(getInfo() + " атакует " + currentEnemy.getInfo());
        doAttack(currentEnemy);
        state = "Attack";
        //System.out.println("Состояние врага " + currentEnemy.state  );
           
         }
        else{
            move(currentEnemy.coordinate, list1);
            state = "Moving";
            //System.out.println(getInfo() + " двигается " + currentEnemy.getInfo() + " " + currentEnemy.state  );
            
        }
    }
    else return;
    }
}


