package game;

public class Sniper extends Shooters {

    public int ammunition;
    
    public Sniper(String name, int strength, int speed, int sleight, int stamina, int determination, int defense, int vulnerability, int damage, int firing_range, int ammunition){
        super(name, strength, speed, sleight, stamina, determination, defense, vulnerability, damage, firing_range);
        this.ammunition = ammunition;
    }

    public Sniper(String name){
        super(name, 8, 8, 9, 8, 9, 9, 3, 3, 10);
        
        this.ammunition = 100;
    }
      
        
    

    public String toString(){
        return String.format("name: %s \nstrength: %d \nspeed: %d \nsleight: %d \nstamina: %d \ndetermination: %d \ndefense: %d \nvulnerability: %d \ndamage: %d \nfiring_range: %d \nammunition: %d ", name, strength, speed, sleight, stamina, determination, defense, vulnerability, damage, firing_range, ammunition);
    }


    public int destractionSingleTargets(){ //уничтожение одиночных целей
        strength +=1;
        return strength;
    }

    public int useAmmunition(){ //использование патронов
        ammunition -=1;
        return ammunition;
    }

    
}
