package game;

public class Crossbowman extends Shooters {

    public int arrays;

    public Crossbowman(String name, int strength, int speed, int sleight, int stamina, int determination, int defense, int vulnerability, int damage, int firing_range, int arrays){
        super(name, strength, speed, sleight, stamina, determination, defense, vulnerability, damage, firing_range);
        this.arrays = arrays;
    }

    public Crossbowman(String name){
        super(name, 7, 7, 6, 6, 9, 9, 7, 6, 10);
        this.arrays = 50;
    }

    public String toString(){
        return String.format("name: %s \nstrength: %d \nspeed: %d \nsleight: %d \nstamina: %d \ndetermination: %d \ndefense: %d \nvulnerability: %d \ndamage: %d \nfiring_range: %d \narrays: %d ", name, strength, speed, sleight, stamina, determination, defense, vulnerability, damage, firing_range, arrays);
    }


    public int decelerationEnemy(){ //замедление противника
        strength +=1;
        return strength;
    }

    public int useArrays(){ //использование стрел
        arrays -=1;
        return arrays;
    }

    
}
