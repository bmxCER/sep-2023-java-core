package hw3.part2;

public class Guitar implements Instrument{
    private int stringsNumber;

    public Guitar(int stringsNumber) {
        this.stringsNumber = stringsNumber;
    }

    @Override
    public void play() {
        System.out.println("Playing on guitar with number of strings: " + stringsNumber);
    }
}
