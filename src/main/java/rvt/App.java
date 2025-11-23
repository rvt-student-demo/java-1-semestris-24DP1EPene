package rvt;

public class App {
    public static void main(String[] args) {
        Custom_input input = new Custom_input();

        int book_count = input.input("Enter the book's count: ", "int");
        Book[] books = new Book[book_count];

        for (int i = 0; i < book_count; i++) {
            System.out.println("Filling out " + (i + 1) + ". book's info.");
            books[i] = new Book(input.input("Enter the release year: ", "int"), input.input("Enter the name of the title: "), input.input("Enter the page count: ", "int"));
        }
        String info = input.input("Enter the info you wish to see: ");
        for (int i = 0; i < book_count; i++) {
            switch (info) {
                case "everything":
                    System.out.printf("%d. books info: \nThe Title of the book: %s\nThe pages count: %d\nThe release year: %d\n", i + 1, books[i].title, books[i].pages_count, books[i].year);
                    break;
                    case "name":
                    System.out.printf("%d. books info: \nThe Title of the book: %s\n", i + 1, books[i].title);
                    break;
                case "page count":
                    System.out.printf("%d. books info: \nThe pages count: %d\n", i + 1, books[i].pages_count);
                    break;
                case "release year":
                    System.out.printf("%d. books info: \nThe release year: %d\n", i + 1, books[i].year);
                    break;
            }
        }
    }
}