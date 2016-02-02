/**
 * Created by PiratePowWow on 2/1/16.
 */
public class Character {
    //this class contains the attributes of a playable character
    private String name;
    private int health;
    private double height;

    public Character(String name, int health, double height) {
        setName(name);
        setHealth(health);
        setHeight(height);
        //this.name = name;
        //this.health = health;
        //this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public double getHeight() {
        return height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        if (healthy(health)) {
            this.health = health;
        }
        else {
            System.out.println("This Character is dead");
        }
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean healthy(int health) {
           return health > 0;
        }

}
