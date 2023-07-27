package game;
import java.util.ArrayList;
public class Rover extends Infantrys {

    public int reticence; //  скрытность
    public int elusiveness; //неуловимость

    public Rover(String name, int strength, int speed, int sleight, int stamina, int determination, int defense, int vulnerability, int damage, int x, int y, String state, int mobility, int reticence, int elusiveness){
        super(name, strength, speed, sleight, stamina, determination, defense, vulnerability, damage, x, y, state, mobility);
        this.reticence = reticence;
        this.elusiveness = elusiveness; 
    }

    public Rover(String name, int x, int y){
        super(name, 10, 8, 10, 7, 7, 7, 7, 2, x, y, "Stand", 8);
        this.reticence = 9;
        this.elusiveness = 8;
    }

    @Override
    public String toString(){
        return String.format("Разбойник name: %s \nstrength: %d \nsleight: %d \ndamage: %d \nx: %d \ny: %d", name, strength, sleight, damage, coordinate.x, coordinate.y);
    }

    public String getReticence(){
        return String.format("Сurrent reticence indicator: %d", reticence);
    }
    

    public String getElusiveness(){
        return String.format("Сurrent elusiveness indicator: %d", elusiveness);
    }
    
    public int doRobbery(){ //грабеж
        return strength;
    }

    public int doBreakingOpen(){  //взлом
        return strength;
    }

    public int setTrap(){  //поставить ловушку
        return strength;
    }

    @Override
    public String getInfo(){
        return "Разбойник" + " " + name + " " + "x: " + coordinate.x + " " +"y: " + coordinate.y+ " " + "инициатива" + " " + sleight + " сила " + strength + " " + state ;
    }


    
    }

    



