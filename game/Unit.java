
package game;

/**
 * Unit
 */
public abstract class Unit {

    public String name;
    public int strength; //сила
    public int speed; //скорость
    public int sleight; // ловкость
    public int stamina; // выносливость
    public int determination; //решительность
    public int defense; // защита
    public int vulnerability; //уязвимость
    public int damage; //максимальные повреждения
    
    public static boolean isDead;

    public Unit(String name, int strength, int speed, int sleight, int stamina, int determination, int defense, int vulnerability, int damage  ){
        this.name = name;
        this.strength = strength;
        this.speed = speed;
        this.sleight = sleight;
        this.stamina = stamina;
        this.determination = determination;
        this.defense = defense;
        this.vulnerability = vulnerability;
        this.damage = damage;
        
    }

    public String getName(){
        return String.format("name: %s", name);
    }

    
    public String getStrength(){
        return String.format("Сurrent strength indicator: %d", strength);
    }

    public String getStrengthSpeed(){
        return String.format("Сurrent speed indicator: %d", speed);
    }

    public String getSleight(){
        return String.format("Сurrent sleight indicator: %d", sleight);
    }

    public String getStamina(){
        return String.format("Сurrent stamina indicator: %d", stamina);
    }

    public String getDetermination(){
        return String.format("Сurrent determination indicator: %d", determination);
    }

    public String getDefence(){
        return String.format("Сurrent defense indicator: %d", defense);
    }

    public String getVulnerability(){
        return String.format("Сurrent vulnerability indicator: %d", vulnerability);
    }

    public String getDamage(){
        return String.format("Сurrent damage indicator: %d", damage);
    }


    public int doAttack(){  //атака
        return damage;
    }
    
}