/**
 * Created by PiratePowWow on 2/1/16.
 */
public class Car {
    //this class contains the attributes of a car
    public String[] makes;
    public String[] models;
    public int year;

    public Car(String[] makes, String[] models, int year) {
        setMakes(makes);
        //this.makes = makes;
        setModels(models);
        setYear(year);

    }

    public String[] getMakes() {
        return makes;
    }

    public String[] getModels() {
        return models;
    }

    public int getYear() {
        return year;
    }

    public void setMakes(String[] makes) {
        if (makes.length == 3) {
            this.makes = makes;
        }
        else {
                System.out.println("Makes has been left blank because I simply must have a car with exactly three makes or none at all");
            }
    }

    public void setModels(String[] models) {
        this.models = models;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
