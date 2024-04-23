package hw3.part2;

public class Drums implements Instrument{
    private int size;

    public Drums(int size) {
        this.size = size;
    }
    @Override
    public void play() {
        System.out.println("Playing on drum with size: " + size);
    }
}
