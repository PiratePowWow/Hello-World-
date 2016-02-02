/**
 * Created by PiratePowWow on 2/1/16.
 */
public class Cat {
    //this class contains the attributes of a cat
    public String species;
    public int age;
    public String temperament;

    public Cat(String species, int age, String temperament) {
        this.species = species;
        this.age = age;
        this.temperament = temperament;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public String getTemperament() {
        return temperament;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTemperament(String temperament) {
        if (temperament != "sassy") {
            this.temperament = temperament;
        }
    }
}
