package rvt;

public class Teacher extends Person{
    String user_name;
    String location;
    int pay;

    public Teacher(String user_name, String location, int pay) {
        super(user_name, location);
        this.user_name = user_name;
        this.location = location;
        this.pay = pay;
    }

    @Override
    public String toString() {
        return user_name + "\n  " + location + "\n  salary " + pay + " euro/month";
    }
}
