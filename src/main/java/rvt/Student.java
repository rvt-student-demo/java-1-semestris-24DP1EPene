package rvt;

public class Student extends Person{
    private int credits = 0;
    private String user_name;
    private String location;

    public Student(String user_name, String location) {
        super(user_name, location);
        this.user_name = user_name;
        this.location = location;
    }

    public int credits() {
        return credits;
    }

    public void study() {
        credits += 1;
    }

    @Override
    public String toString() {
        return user_name + "\n  " + location + "\n  Study credits " + credits;
    }
}
