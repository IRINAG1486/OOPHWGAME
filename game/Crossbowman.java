package game;
import java.util.ArrayList;
public class Crossbowman extends Shooters {

  

    public Crossbowman(String name, int strength, int speed, int sleight, int stamina, int determination, int defense, int vulnerability, int damage, int x, int y, String state, int firing_range, int arrays){
        super(name, strength, speed, sleight, stamina, determination, defense, vulnerability, damage, x, y, state, firing_range, arrays);
        
    }

    public Crossbowman(String name, int x, int y){
        super(name, 10, 8, 9, 8, 8, 8, 8, 4, x, y, "Stand", 9, 10);
        
    }
    @Override
    public String toString(){
        return String.format("Арбалетчик name: %s \nstrength: %d \nsleight: %d \ndamage: %d \nx: %d \ny: %d \narrays: %d ", name, strength, sleight, damage, coordinate.x, coordinate.y, arrays);
    }


    public int decelerationEnemy(){ //замедление противника
        strength +=1;
        return strength;
    }

    public int useArrays(){ //использование стрел
        arrays -=1;
        return arrays;
    }

    @Override
    public String getInfo(){
        return "Арбалетчик" + " " + name + " " + "x: " + coordinate.x + " " +"y: " + coordinate.y+ " " + "инициатива" + " " + sleight + " сила " + strength + " " + state ;
    }




}

