package game;

public class Mage extends Magicians {

    public Mage(String name, int strength, int speed, int sleight, int stamina, int determination, int defense, int vulnerability, int damage, int x, int y, String state, int mana, int knowledge){
        super(name, strength, speed, sleight, stamina, determination, defense, vulnerability, damage,x, y, state, mana, knowledge);
        
    }

    public Mage(String name, int x, int y){
        super(name, 4, 4, 3, 2, 3, 4, 8, 8, x, y, "Stand", 10, 10);
    }

    public String toString(){
        return String.format("Маг name: %s \nstrength: %d \nspeed: %d \nsleight: %d \nstamina: %d \ndetermination: %d \ndefense: %d \nvulnerability: %d \ndamage: %d \nx: %d \ny: %d \nmana: %d \nknowledge: %d", name, strength, speed, sleight, stamina, determination, defense, vulnerability, damage, coordinate.x, coordinate.y, mana, knowledge);
    }

    public int destructiveMantra(){ // разрушающее заклинание
        return strength;
    }

    public String getInfo(){
        return "Маг" + " " + name + " " + "x: " + coordinate.x + " " +"y: " + coordinate.y+ " " + "ловкост" + " " + sleight;
    }
    
}
