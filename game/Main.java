package game;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList <Unit> list1 = new ArrayList<>();
        ArrayList <Unit> list2 = new ArrayList<>();

        //Countryman farmer = new Countryman(getName(), getX(), getY());
        //System.out.println(farmer);
        Crossbowman crossbowman = new Crossbowman(getName(), getX(), getY());
        

        for(int i = 0; i <=10; i++){
                      
            list1.add(new Mage(getName(), getX(), getY()));
            list1.add(new Crossbowman(getName(), getX(), getY()));
            list1.add(new Monk(getName(), getX(), getY()));
            list1.add(new Rover(getName(), getX(), getY()));
            list1.add(new Sniper(getName(), getX(), getY()));
            list1.add(new Spearman(getName(), getX(), getY()));
            list1.add(new Countryman(getName(), getX(), getY()));
        }
        for(int i = 0; i < list1.size(); i++){
            System.out.println("Противник: " + i + " " + list1.get(i).getInfo());
        }
        //list1.forEach(n -> System.out.println(n + n.getInfo()));
        
       //farmer.findClosestEnemy(list1);
        
        System.out.println();

        //Spearman sperman = new Spearman(getName(), getX(), getY());
        //System.out.println(sperman);

        for(int i = 0; i <=10; i++){
            list2.add(new Spearman(getName(), getX(), getY()));
            list2.add(new Sniper(getName(), getX(), getY()));
            list2.add(new Rover(getName(), getX(), getY()));
            list2.add(new Monk(getName(), getX(), getY()));
            list2.add(new Mage(getName(), getX(), getY()));
            list2.add(new Crossbowman(getName(), getX(), getY()));
            list2.add(new Countryman(getName(), getX(), getY()));
        }
        
        for(int i = 0; i < list2.size(); i++){
            System.out.println("Противник: " + i + " " + list2.get(i).getInfo() +" "+ list2.get(i).coordinate.calculateDistance(list2.get(i).coordinate) );
        }
        //list2.forEach(n -> System.out.println(n.getInfo()));
        //sperman.findClosestEnemy(list2);

        //Monk monk1 = new Monk("Monax", 2, 1);
        
        // Mage mage1 = new Mage("Mag");
        // Rover rover1 = new Rover("Razboynik");
        // Spearman spearman1 = new Spearman("Kopeishik");
        // Sniper sniper1 = new Sniper("Snaiper");
        // Crossbowman arrayman = new Crossbowman("ArrayMan");

        // System.out.println(monk1.getInfo());
        // System.out.println(mage1.getInfo());
        
        // System.out.println(mage1);
        // System.out.println();
        // System.out.println(monk1);

        // System.out.println(monk1.getName());
        // System.out.println(monk1.getStrength());

        // monk1.setHealing(23);
        // monk1.getHealing();

        // monk1.warriorTreatment();
        // System.out.println(monk1);

        // System.out.println(mage1.getMana());

        // System.out.println();

        // System.out.println(rover1);

        // System.out.println(rover1.getDetermination());

        // System.out.println();

        // System.out.println(spearman1);

        // spearman1.doCrusialHit();

        // System.out.println();

        // System.out.println(sniper1);
        // System.out.println(sniper1.destractionSingleTargets());
        // System.out.println(sniper1);

        // System.out.println();

        // System.out.println(arrayman);
        // System.out.println(arrayman.useArrays());
        // System.out.println(arrayman);
        

        
    }

    private static String getName(){
        String name = String.valueOf(Name.values()[new Random().nextInt(Name.values().length)]);
        return name;
    }
    
    private static int getX(){
        int x = new Random().nextInt(1000);
        return x;
    }

    private static int getY(){
        int y = new Random().nextInt(1000);
        return y;
    }
    

}
