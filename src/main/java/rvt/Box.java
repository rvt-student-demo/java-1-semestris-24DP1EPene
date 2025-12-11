package rvt;

/**
 * A class that represents a cardboard box.
 * Immutable: once created, its dimensions cannot be changed.
 */
public class Box {
    private double width; private double height; private double length;

    public Box(double width, double height, double length) {
        this.width = width; this.height = height; this.length = length;
        
    }

    public Box(double side) {
        this.width = side; this.height = side; this.length = side;
    }

    public Box(Box other_box) {
        this.width = other_box.get_width(); this.height = other_box.get_height(); this.length = other_box.get_length();
    }

    private double face_area() {
        return height * width;
    }

    private double top_area() {
        return width * length;
    }

    private double side_area() {
        return height * length;
    }

    public double volume() {
        return width * height * length;
    }

    public double area() {
        return top_area() * 2 + face_area() * 2 + side_area() * 2;
    }

    public double get_width() {
        return width;
    }

    public double get_height() {
        return height;
    }

    public double get_length() {
        return length;
    }

    public Box bigger_box(Box old_box) {
        return new Box(1.25 * width, 1.25 * height, 1.25 * length);
    }

    public Box smaller_box(Box old_box) {
        return new Box(0.75 * width, 0.75 * height, 0.75 * length);
    }

    public boolean nests(Box other_box) {
        if (other_box.get_height() <= height && other_box.get_length() <= length && other_box.get_width() <= width) {
            return true;
        }
        else {
            return false;
        }
    }
}
