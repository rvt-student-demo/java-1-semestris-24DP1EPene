package rvt;

public class Person {

    private String user_name;
    private String location;
    private int age;
    private int weight;
    private int height;

    public Person(String user_name, String location) {
        this.user_name = user_name;
        this.location = location;
    }

    public Person(String user_name, int age, int height, int weight) {
        this.user_name = user_name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    // other constructors and methods

    public String get_user_name() {
        return this.user_name;
    }

    public int get_age() {
        return this.age;
    }

    public int get_height() {
        return this.height;
    }

    public void grow_older() {
        this.age = this.age + 1;
    }

    public void set_height(int newHeight) {
        this.height = newHeight;
    }

    public void set_weight(int newWeight) {
        this.weight = newWeight;
    }

    public double body_mass_index() {
        double height_per_hundred = this.height / 100.0;
        return this.weight / (height_per_hundred * height_per_hundred);
    }

    @Override
    public String toString() {
        return user_name + "\n  " + location;
    }
}