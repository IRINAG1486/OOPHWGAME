package game;

public class Countryman extends Infantrys {

    public Countryman(String name, int strength, int speed, int sleight, int stamina, int determination, int defense, int vulnerability, int damage, int mobility, int reticence, int elusiveness){
        super(name, strength, speed, sleight, stamina, determination, defense, vulnerability, damage, mobility);
        
    }

    public Countryman(String name){
       super(name, 3, 5, 3, 4, 0, 0, 10, 10, 8);
        
    }

    public String toString(){
        return String.format("name: %s \nstrength: %d \nspeed: %d \nsleight: %d \nstamina: %d \ndetermination: %d \ndefense: %d \nvulnerability: %d \ndamage: %d \nmobility: %d ", name, strength, speed, sleight, stamina, determination, defense, vulnerability, damage, mobility);
    }


    public int bringLance(){ //принести копье
        return strength;
    }
    
}
