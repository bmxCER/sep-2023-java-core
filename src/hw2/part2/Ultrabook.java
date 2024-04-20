package hw2.part2;

public class Ultrabook extends Laptop{
    private int thickness;

    public Ultrabook(String CPU, String GPU, String RAM, int weight, int accumulator, int thickness) {
        super(CPU, GPU, RAM, weight, accumulator);
        this.thickness = thickness;
    }

    public int getThickness() {
        return thickness;
    }

    public void setThickness(int thickness) {
        this.thickness = thickness;
    }

    @Override
    public String toString() {
        return "Ultrabook{" +
                "thickness='" + thickness + '\'' +
                '}';
    }
}
