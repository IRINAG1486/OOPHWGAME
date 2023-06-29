package game;

public class Mage extends Magicians {

    public Mage(String name, int strength, int speed, int sleight, int stamina, int determination, int defense, int vulnerability, int damage, int mana, int knowledge){
        super(name, strength, speed, sleight, stamina, determination, defense, vulnerability, damage, mana, knowledge);
        
    }

    public Mage(String name){
        super(name, 4, 4, 3, 2, 3, 4, 8, 8, 10, 10);
    }

    public String toString(){
        return String.format("name: %s \nstrength: %d \nspeed: %d \nsleight: %d \nstamina: %d \ndetermination: %d \ndefense: %d \nvulnerability: %d \ndamage: %d \nmana: %d \nknowledge: %d", name, strength, speed, sleight, stamina, determination, defense, vulnerability, damage, mana, knowledge);
    }

    public int destructiveMantra(){ // разрушающее заклинание
        return strength;
    }
    
}
