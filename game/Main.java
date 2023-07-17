package game;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList <Unit> list1 = new ArrayList<>();
        ArrayList <Unit> list2 = new ArrayList<>();

        for(int i = 1; i <2; i++){
                      
            list1.add(new Mage(getName(), getX(), getY()));
            //list1.add(new Crossbowman(getName(), getX(), getY()));
            //list1.add(new Monk(getName(), getX(), getY()));
            //list1.add(new Rover(getName(), getX(), getY()));
            list1.add(new Sniper(getName(), getX(), getY()));
            list1.add(new Spearman(getName(), getX(), getY()));
            list1.add(new Countryman(getName(), getX(), getY()));
            list1.add(new Mage(getName(), getX(), getY()));
        }
        for(int i = 0; i < list1.size(); i++){
            System.out.println("Команда 1: " + i + " " + list1.get(i).getInfo());
        }
        
        System.out.println();

        for(int i = 1; i <2; i++){
            //list2.add(new Spearman(getName(), getX(), getY()));
            //list2.add(new Sniper(getName(), getX(), getY()));
            list2.add(new Rover(getName(), getX(), getY()));
            list2.add(new Monk(getName(), getX(), getY()));
            list2.add(new Monk(getName(), getX(), getY()));
            list2.add(new Crossbowman(getName(), getX(), getY()));
            list2.add(new Countryman(getName(), getX(), getY()));
            //list2.add(new Countryman(getName(), getX(), getY()));
        }
        
        for(int i = 0; i < list2.size(); i++){
            System.out.println("Команда 2: " + i + " " + list2.get(i).getInfo());
        }

        System.out.println();

        ArrayList <Unit> allHeroes = new ArrayList<>();
        allHeroes.addAll(list1);
        allHeroes.addAll(list2);

        Collections.sort(allHeroes, (o1, o2) -> o2.getSleight() - o1.getSleight());
        for (Unit hero : allHeroes) {
            System.out.println(hero.getInfo());
        }

        for(int i = 1; i<=1; i++){
            System.out.println();
            System.out.println("Round " + i + ":");
    
            for (Unit heroes : allHeroes) {
               heroes.step(list1, list2);;
            
            }
    
          
        }

        
    }
    private static String getName(){
        String name = String.valueOf(Name.values()[new Random().nextInt(Name.values().length)]);
        return name;
    }
    
    private static int getX(){
        int x = new Random().nextInt(11);
        return x;
    }

    private static int getY(){
        int y = new Random().nextInt(11);
        return y;
    }
}


    


