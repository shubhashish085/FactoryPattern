package factorypattern;

import java.util.Scanner;

public class FactoryPattern {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        EnemyShip object = null;
        String enemyShip = null;
        EnemyShipFactory ob1 = new EnemyShipFactory();
        System.out.println("What type of Ship(U/R/B)");
        
            enemyShip = reader.next();
            object = ob1.makeEnemyShip(enemyShip);
            doSomething(object);
        

    }

    public static void doSomething(EnemyShip obj) {
        obj.displayEnemyShip();
        obj.followHeroShip();
        obj.enemyShipShoots();
    }
}
