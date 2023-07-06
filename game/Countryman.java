package game;

public class Countryman extends Infantrys {

    public Countryman(String name, int strength, int speed, int sleight, int stamina, int determination, int defense, int vulnerability, int damage, int x, int y, int mobility){
        super(name, strength, speed, sleight, stamina, determination, defense, vulnerability, damage, x, y, mobility);
        
    }

    public Countryman(String name, int x, int y){
       super(name, 3, 5, 3, 4, 0, 0, 10, 10, x, y, 8);
        
    }

    public String toString(){
        return String.format("Крестьянин name: %s \nstrength: %d \nspeed: %d \nsleight: %d \nstamina: %d \ndetermination: %d \ndefense: %d \nvulnerability: %d \ndamage: %d \nx: %d \ny: %d \nmobility: %d ", name, strength, speed, sleight, stamina, determination, defense, vulnerability, damage, coordinate.x, coordinate.y, mobility);
    }


    public int bringLance(){ //принести копье
        return strength;
    }

    public String getInfo(){
        return "Крестьянин" + " " + name + " " + "x: " + coordinate.x + " " +"y: " + coordinate.y;
    } 

    
    
    
}
