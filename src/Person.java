/**
 * Created by PiratePowWow on 2/1/16.
 */
public class Person {
    public String name;
    public int age;
    public boolean isAlive = true;
    public String address;

    public Person(){

    }

    public Person(String name, int age){
        setName(name);
        setAge(age);
        setAlive(true);
        //this(name, age, true) is equivalent, searches for a constructor with matching arguments
    }

    public Person(String name, int age, boolean isAlive){
        setName(name);
        setAge(age);
        setAlive(isAlive);
        //this.name = name;
        //this.age = age;
        //this.isAlive = isAlive;

    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        if (isValidName(newName)) {
            name = newName;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        if (newAge >= 0){
            age = newAge;
        }
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public static boolean isValidName(String name) {
        return name.contains(" ");
    }



    //STATIC
    //Person --> P1 = new Person(), P2 = new Person(), P3 = new Person() etc
    //Blueprint housename = new Blueprint
    //
    //public static
    //static fields are a shared value across a class
    //System.out is a static field for class System
    //Static methods can be called without a class object by using syntax Class.method(args)
}
