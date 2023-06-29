package game;

public class Spearman extends Infantrys {
    

    public Spearman(String name, int strength, int speed, int sleight, int stamina, int determination, int defense, int vulnerability, int damage, int mobility){
        super(name, strength, speed, sleight, stamina, determination, defense, vulnerability, damage, mobility);
        
    }

    public Spearman(String name){
       super(name, 9, 8, 7, 8, 9, 9, 7, 8, 8);
        
    }

    public String toString(){
        return String.format("name: %s \nstrength: %d \nspeed: %d \nsleight: %d \nstamina: %d \ndetermination: %d \ndefense: %d \nvulnerability: %d \ndamage: %d \nmobility: %d ", name, strength, speed, sleight, stamina, determination, defense, vulnerability, damage, mobility);
    }


    public int doCrusialHit(){ //критический удар
        return strength;
    }

    

    


    
}
