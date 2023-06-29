package game;

public abstract class Shooters extends Unit {
    public int firing_range; //дальность стрельбы
    
    public Shooters(String name, int strength, int speed, int sleight, int stamina, int determination, int defense, int vulnerability, int damage, int firing_range){
        super(name, strength, speed, sleight, stamina, determination, defense, vulnerability, damage);
        this.firing_range = firing_range;
    
}

public int doShootingFight(){ // стрелковый бой
    return damage;
}

}
