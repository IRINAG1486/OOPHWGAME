package game;
import java.util.ArrayList;
import java.util.Random;

public class Monk extends Magicians {

    private int healing; //врачевание
    
    public Monk(String name, int strength, int speed, int sleight, int stamina, int determination, int defense, int vulnerability, int damage, int x, int y, String state, int mana, int knowledge){
        super(name, strength, speed, sleight, stamina, determination, defense, vulnerability, damage, x, y, state, mana, knowledge);
       
    }
    
    public Monk(String name, int x, int y){
        super(name, 10, 6, 4, 5, 5, 5, 5, 3, x, y, "Stand", 10, 10);
    }

    @Override
    public String toString(){
        return String.format("монах name: %s \nstrength: %d \nsleight: %d \ndamage: %d \nx: %d \ny: %d ", name, strength,  sleight, damage, coordinate.x, coordinate.y);
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
        return "Монах" + " " + name + " " + "x: " + coordinate.x + " " +"y: " + coordinate.y+ " " + "инициатива" + " " + sleight + " сила " + strength + " " + state ;
    }


}
