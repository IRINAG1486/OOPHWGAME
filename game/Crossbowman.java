package game;
import java.util.ArrayList;
public class Crossbowman extends Shooters {

  

    public Crossbowman(String name, int strength, int speed, int sleight, int stamina, int determination, int defense, int vulnerability, int damage, int x, int y, String state, int firing_range, int arrays){
        super(name, strength, speed, sleight, stamina, determination, defense, vulnerability, damage, x, y, state, firing_range, arrays);
        
    }

    public Crossbowman(String name, int x, int y){
        super(name, 7, 7, 6, 6, 9, 9, 7, 8, x, y, "Stand", 9, 9);
        
    }

    public String toString(){
        return String.format("Арбалетчик name: %s \nstrength: %d \nspeed: %d \nsleight: %d \nstamina: %d \ndetermination: %d \ndefense: %d \nvulnerability: %d \ndamage: %d \nx: %d \ny: %d \nfiring_range: %d \narrays: %d ", name, strength, speed, sleight, stamina, determination, defense, vulnerability, damage, coordinate.x, coordinate.y, firing_range, arrays);
    }


    public int decelerationEnemy(){ //замедление противника
        strength +=1;
        return strength;
    }

    public int useArrays(){ //использование стрел
        arrays -=1;
        return arrays;
    }

    public String getInfo(){
        return "Арбалетчик" + " " + name + " " + "x: " + coordinate.x + " " +"y: " + coordinate.y+ " " + "ловкост" + " " + sleight;
    }

    


}

