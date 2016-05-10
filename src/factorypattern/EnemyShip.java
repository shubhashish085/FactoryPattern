package factorypattern;

public abstract class EnemyShip {

    private String name;
    private double damage;

    public String getName() {
        return name;
    }

    public double getDamage() {
        return damage;
    }

    public void setName(String str) {
        name = str;
    }

    public void setDamage(double dam) {
        damage = dam;

    }
    public void followHeroShip(){
        System.out.println(getName() + " is following the hero ship");
    
    }
    public void displayEnemyShip(){
        System.out.println(getName()+ "is on the screen ");
    
    }
    public void enemyShipShoots(){
        System.out.println(getName() + " attacks and gets damage " + getDamage());
    }
}
