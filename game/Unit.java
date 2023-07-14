
package game;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Random;
import java.util.Collections;
/**
 * Unit
 */


public abstract class Unit implements InGameInterface {

    public String name;
    public int strength; //сила
    public int speed; //скорость
    public int sleight; // ловкость
    public int stamina; // выносливость
    public int determination; //решительность
    public int defense; // защита
    public int vulnerability; //уязвимость
    public int damage; //максимальные повреждения
    public String state;
    
    public Coordinate coordinate;


    public static boolean isDead;

    public Unit(String name, int strength, int speed, int sleight, int stamina, int determination, int defense, int vulnerability, int damage, int x, int y, String state){
        this.name = name;
        this.strength = strength;
        this.speed = speed;
        this.sleight = sleight;
        this.stamina = stamina;
        this.determination = determination;
        this.defense = defense;
        this.vulnerability = vulnerability;
        this.damage = damage;
        this.coordinate = new Coordinate(x, y);
        this.state = state;
    }

    public static boolean isDead() {
        return isDead;
    }
    public String getName(){
        return String.format("name: %s", name);
    }

    
    public int getStrength(){
        return strength;
        // return String.format("Сurrent strength indicator: %d", strength);
    }

    public String getSpeed(){
        return String.format("Сurrent speed indicator: %d", speed);
    }

    // public String getSleight(){
    //     return String.format("Сurrent sleight indicator: %d", sleight);
    // }
    public int getSleight(){
        return sleight;
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

    public String getState(){
        return state;
    }

  
    public void doAttack(Unit target) {
        int damage = 1;
        target.getDamage(damage);
    }

    public void getDamage(int damage) {
        if (this.strength - damage > 0) {
            this.strength -= damage;
            System.out.println(strength);
        }
       
        else {//this.strength = 0; 
            isDead = true;
            System.out.println("daed");
        }

    }

   

    // public void GetСure(int cure) {
    //     if (this.hp !=0 && this.hp + cure < 200) {
    //         this.hp += cure;
    //     }
    //     else {
    //         if (this.hp == 0){
    //             this.hp = 0;
    //         }
    //         else{
    //             this.hp = 200;
    //         }
    //     }

    public String getInfo(){
        return name + " " + "x: " + coordinate.x + " " +"y: " + coordinate.y  + " " + "ловкост" + " " + sleight;
    }

   


    public Unit findClosestEnemy(ArrayList <Unit> list){
        double max = 1000;
        int index = 0;
        
        for (int i = 0; i < list.size(); i++ ) {

           if (coordinate.calculateDistance(list.get(i).coordinate) < max){
                max = coordinate.calculateDistance(list.get(i).coordinate);
                index = i;  
           }
        }
        //double[] data = new double[]{max, index};
        System.out.println("Ближайший враг " + list.get(index).name + " " + "индекс " + index + " " + "находящийся на дистанции " + max);
        //System.out.println(max);
        //System.out.println(index);
        return list.get(index);
    }
    
   
//     public void sortCharacter(ArrayList<Unit> list1){
       
//         Collections.sort(list1, new Comparator<Unit>() {
//             @Override
//             public int compare(Unit o1, Unit o2){
//                 return o1.getSleight() - o2.getSleight();
//             }
            
            
//         });
        
//         for (Unit hero : list1) {
//             System.out.println(hero.getInfo());
//     }
// }

    @Override
    public void step(ArrayList<Unit> list1, ArrayList <Unit> list2){
        if (!isDead()) {
        state = "Stand";
        }
    }
}



    

    
    

