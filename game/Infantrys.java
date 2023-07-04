package game;

public abstract class Infantrys extends Unit {

    public int mobility; //мобильность

    public Infantrys(String name, int strength, int speed, int sleight, int stamina, int determination, int defense, int vulnerability, int damage, int x,  int y, int mobility){
        super(name, strength, speed, sleight, stamina, determination, defense, vulnerability, damage, x, y);
        this.mobility = mobility;
}

    public String getMobility(){
        return String.format("Сurrent mobility indicator: %d", mobility);
}

    public int doInfighting(){ // ближний бой
        return damage;
    }

    
    public int doStun(){ // оглушение
        return strength;
    }

    
    public int doDeflexure(){ //уклонение
        return damage;
    }

    public int doRecce(){ //разведка
        return damage;
    }

}
