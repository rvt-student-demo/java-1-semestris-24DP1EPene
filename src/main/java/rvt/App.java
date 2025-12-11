package rvt;

public class App {
  public static void main ( String[] args ) {
    Box my_box = new Box(5, 4, 3);
    Box some_box = new Box(10);
    Box my_box_copy = new Box(my_box);
    Box my_box_bigger = my_box.bigger_box(my_box);
    Box my_box_smaller = my_box.smaller_box(my_box);
    System.out.println("Is volume the same for my box and the other box: " + (my_box.volume() == my_box_copy.volume()) + "\n" +
                       "Is area the same for my box and the other box: " + (my_box.area() == my_box_copy.area()) + "\n" +
                       "Some box volume: " + some_box.volume() + "\n" +
                       "Some box area: " + some_box.area() + "\n" +
                       "Some box width: " + some_box.get_width() + "\n" +
                       "Some box height: " + some_box.get_height() + "\n" +
                       "Some box length: " + some_box.get_length() + "\n" +
                       "My box bigger volume: " + my_box_bigger.volume() + "\n" +
                       "My box bigger area: " + my_box_bigger.area() + "\n" +
                       "My box smaller volume: " + my_box_smaller.volume() + "\n" +
                       "My box smaller area: " + my_box_smaller.area() + "\n" +
                       "Does my box nest inside my bigger box: " + my_box_bigger.nests(my_box) + "\n" +
                       "Does my box nest inside my smaller box: " + my_box_smaller.nests(my_box));
  }
}