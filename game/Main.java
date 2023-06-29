package game;

public class Main {
    public static void main(String[] args) {

        Monk monk1 = new Monk("Monax");
        Mage mage1 = new Mage("Mag");
        Rover rover1 = new Rover("Razboynik");
        Spearman spearman1 = new Spearman("Kopeishik");
        Sniper sniper1 = new Sniper("Snaiper");
        Crossbowman arrayman = new Crossbowman("ArrayMan");
        
        System.out.println(mage1);
        System.out.println();
        System.out.println(monk1);

        System.out.println(monk1.getName());
        System.out.println(monk1.getStrength());

        monk1.setHealing(23);
        monk1.getHealing();

        monk1.warriorTreatment();
        System.out.println(monk1);

        System.out.println(mage1.getMana());

        System.out.println();

        System.out.println(rover1);

        System.out.println(rover1.getDetermination());

        System.out.println();

        System.out.println(spearman1);

        spearman1.doCrusialHit();

        System.out.println();

        System.out.println(sniper1);
        System.out.println(sniper1.destractionSingleTargets());
        System.out.println(sniper1);

        System.out.println();

        System.out.println(arrayman);
        System.out.println(arrayman.useArrays());
        System.out.println(arrayman);
        


    }
    

    

}
