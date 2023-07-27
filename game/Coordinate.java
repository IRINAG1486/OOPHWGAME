package game;

import java.util.ArrayList;

public class Coordinate {

    public int x;
    public int y;

    public Coordinate(int x, int y){
        this.x = x;
        this.y = y;

    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }
//расчет дистанции
    public double calculateDistance(Coordinate coordinates) {
        int deltaX = coordinates.getX() - this.x;
        int deltaY = coordinates.getY() - this.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    } 

//поиск нового направления
    public Coordinate newCoordinate (Coordinate enemyPosition, ArrayList<Unit> teamMates){
        Coordinate currentPosition = new Coordinate(x, y);

        if(Math.abs(enemyPosition.x - x) >= Math.abs(enemyPosition.y - y)){
            if (enemyPosition.x - x > 0){
                 currentPosition.x +=1;
            }
            else {
                currentPosition.x -=1;
            }

        }
        if(Math.abs(enemyPosition.x - x) < Math.abs(enemyPosition.y - y)){
            if (enemyPosition.y - y > 0){
                 currentPosition.y +=1;
            }
            else {
                currentPosition.y -=1;
            }
        }
        return currentPosition;
    }

    //проверка есть на пути "свои"
    public boolean containsByPosition(Coordinate nextPosition, ArrayList<Unit> teamMates){
        for(Unit unit: teamMates){
            if(unit.coordinate == nextPosition){
                return true;
            }
        }
        return false;
    }
}

