package factorypattern;

public class EnemyShipFactory {

    public static EnemyShip makeEnemyShip(String str) {
        if (str.equals("U")) {
            return new UFOEnemyShip();
        } else if (str.equals("R")) {
            return new RocketEnemyShip();

        } else if (str.equals("B")) {
            return new BigUFOEnemyShip();
        } else {
            return null;
        }

    }
}
