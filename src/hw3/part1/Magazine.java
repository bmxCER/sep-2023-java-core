package hw3.part1;

public class Magazine implements Printable{
    private String title;

    public Magazine(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Printing magazine: " + title);
    }
}
