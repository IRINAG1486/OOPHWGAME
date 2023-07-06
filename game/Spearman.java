package game;

public class Spearman extends Infantrys {
    

    public Spearman(String name, int strength, int speed, int sleight, int stamina, int determination, int defense, int vulnerability, int damage, int x, int y, int mobility){
        super(name, strength, speed, sleight, stamina, determination, defense, vulnerability, damage, x, y, mobility);
        
    }

    public Spearman(String name, int x, int y){
       super(name, 9, 8, 7, 8, 9, 9, 7, 8, x, y, 8);
        
    }

    public String toString(){
        return String.format("Копейщик name: %s \nstrength: %d \nspeed: %d \nsleight: %d \nstamina: %d \ndetermination: %d \ndefense: %d \nvulnerability: %d \ndamage: %d \nx: %d \ny: %d \nmobility: %d ", name, strength, speed, sleight, stamina, determination, defense, vulnerability, damage, coordinate.x, coordinate.y, mobility);
    }


    public int doCrusialHit(){ //критический удар
        return strength;
    }

    public String getInfo(){
        return "Копейщик" + " " + name + " " + "x: " + coordinate.x + " " +"y: " + coordinate.y;
    }

    

    


    
}
