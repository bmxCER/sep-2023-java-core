package hw3.part2;

public class Trumpet implements Instrument{
    private int diameter;

    public Trumpet(int diameter) {
        this.diameter = diameter;
    }
    @Override
    public void play() {
        System.out.println("Playing on trumpet with diameter: " + diameter);
    }
}
