/**
 * Created by PiratePowWow on 2/1/16.
 */
public class Plant {
    //this class contains the attributes of a plant
    public String species;
    public double height;

    public Plant(String species, double height) {
        this.species = species;
        //this.height = height;
        setHeight(height);
    }

    public String getSpecies() {
        return species;
    }

    public double getHeight() {
        return height;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setHeight(double height) {
        if (height > 20) {
            System.out.println("That's a tree silly!");
            this.height = height;
        }
        else {
            this.height = height;
        }
    }
}
