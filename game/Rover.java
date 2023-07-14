package game;

public class Rover extends Infantrys {

    public int reticence; //  скрытность
    public int elusiveness; //неуловимость

    public Rover(String name, int strength, int speed, int sleight, int stamina, int determination, int defense, int vulnerability, int damage, int x, int y, String state, int mobility, int reticence, int elusiveness){
        super(name, strength, speed, sleight, stamina, determination, defense, vulnerability, damage, x, y, state, mobility);
        this.reticence = reticence;
        this.elusiveness = elusiveness; 
    }

    public Rover(String name, int x, int y){
        super(name, 7, 8, 9, 6, 3, 5, 8, 8, x, y, "Stand", 5);
        this.reticence = 9;
        this.elusiveness = 8;
    }

    public String toString(){
        return String.format("Разбойник name: %s \nstrength: %d \nspeed: %d \nsleight: %d \nstamina: %d \ndetermination: %d \ndefense: %d \nvulnerability: %d \ndamage: %d \nx: %d \ny: %d \nmobility: %d \nreticence: %d \nelusiveness: %d", name, strength, speed, sleight, stamina, determination, defense, vulnerability, damage, coordinate.x, coordinate.y, mobility, reticence, elusiveness);
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

    public String getInfo(){
        return "Разбойник" + " " + name + " " + "x: " + coordinate.x + " " +"y: " + coordinate.y+ " " + "ловкост" + " " + sleight;
    }


}

