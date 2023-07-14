package game;

public class Sniper extends Shooters {

    
    
    public Sniper(String name, int strength, int speed, int sleight, int stamina, int determination, int defense, int vulnerability, int damage, int x, int y, String state, int firing_range, int arrays){
        super(name, strength, speed, sleight, stamina, determination, defense, vulnerability, damage, x, y, state, firing_range, arrays);
        
    }

    public Sniper(String name, int x, int y){
        super(name, 6, 8, 6, 8, 7, 6, 8, 6, x, y, "Stand", 10, 10 );
        
       
    }
      
        
    

    public String toString(){
        return String.format("Снайпер name: %s \nstrength: %d \nspeed: %d \nsleight: %d \nstamina: %d \ndetermination: %d \ndefense: %d \nvulnerability: %d \ndamage: %d \nx: %d \ny: %d \nfiring_range: %d \nammunition: %d ", name, strength, speed, sleight, stamina, determination, defense, vulnerability, damage, coordinate.x, coordinate.y, firing_range, arrays);
    }


    public int destractionSingleTargets(){ //уничтожение одиночных целей
        strength +=1;
        return strength;
    }

    public int useAmmunition(){ //использование патронов
        arrays -=1;
        return arrays;
    }

    public String getInfo(){
        return "Снайпер" + " " + name + " " + "x: " + coordinate.x + " " +"y: " + coordinate.y+ " " + "ловкост" + " " + sleight;
    }
    
}
