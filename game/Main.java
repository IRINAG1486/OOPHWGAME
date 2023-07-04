package game;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Countryman farmer = new Countryman(getName(), 2, 3);

        ArrayList <Unit> list1 = new ArrayList<>();
        ArrayList <Unit> list2 = new ArrayList<>();

        for(int i = 0; i <=10; i++){
           
            list1.add(new Countryman(getName()));
            list1.add(new Mage(getName()));
            list1.add(new Crossbowman(getName()));
            list1.add(new Monk(getName()));
            list1.add(new Rover(getName()));
            list1.add(new Sniper(getName()));
            list1.add(new Spearman(getName()));
        }
        list1.forEach(n -> System.out.println(n.getInfo()));

        // // System.out.println(list1.get(0).getInfo());
        // System.out.println();

        // for(int i = 0; i <=10; i++){
        //     list2.add(new Spearman(getName()));
        //     list2.add(new Sniper(getName()));
        //     list2.add(new Rover(getName()));
        //     list2.add(new Monk(getName()));
        //     list2.add(new Mage(getName()));
        //     list2.add(new Crossbowman(getName()));
        //     list2.add(new Countryman(getName()));
        // }

        //list2.forEach(n -> System.out.println(n.getInfo()));


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
    

    

}
