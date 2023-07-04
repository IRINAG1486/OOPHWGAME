package game;
import java.util.Random;

public class Monk extends Magicians {

    private int healing; //врачевание
    
    public Monk(String name, int strength, int speed, int sleight, int stamina, int determination, int defense, int vulnerability, int damage, int x, int y, int mana, int knowledge){
        super(name, strength, speed, sleight, stamina, determination, defense, vulnerability, damage, x, y, mana, knowledge);
       
    }
    
    public Monk(String name, int x, int y){
        super(name, 7, 7, 7, 2, 3, 4, 8, 8, x, y, 10, 10);
    }

    public String toString(){
        return String.format("name: %s \nstrength: %d \nspeed: %d \nsleight: %d \nstamina: %d \ndetermination: %d \ndefense: %d \nvulnerability: %d \ndamage: %d \nmana: %d \nknowledge: %d \nhealing: %d", name, strength, speed, sleight, stamina, determination, defense, vulnerability, damage, mana, knowledge, healing);
    }

    public int setHealing(int healing){
        return this.healing = healing;
    }

    public int getHealing(){
        System.out.println("Сurrent healing indicator: " + healing);
        return healing;
    }

    public int stickStrike(){ // удар палкой
        return strength;
    }

    public int warriorTreatment(){  // лечение воинов
        healing += 1;
        return healing;
    }

    public String getInfo(){
        return "Монах" + " " + name;
    }

   
}
