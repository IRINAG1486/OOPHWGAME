package game;

public abstract class Magicians extends Unit {
    
    public int mana; //магия
    public int knowledge; //знания
 
    public Magicians(String name, int strength, int speed, int sleight, int stamina, int determination, int defense, int vulnerability, int damage, int x, int y,  int mana, int knowledge){
        super(name, strength, speed, sleight, stamina, determination, defense, vulnerability, damage, x, y);
        this.mana = mana;
        this.knowledge = knowledge;
    }

    public String getMana(){
        return String.format("Сurrent mana indicator: %d", mana);
    }

    public String getKnowledge(){
        return String.format("Сurrent knowledge indicator: %d", knowledge);
    }

    public int magicAtack(){ //магическая атака
        return strength;
    }
}
