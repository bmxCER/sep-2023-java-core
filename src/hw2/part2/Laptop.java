package hw2.part2;

public class Laptop extends PC{

    private int weight;
    private int accumulator;

    public Laptop(String CPU, String GPU, String RAM, int weight, int accumulator) {
        super(CPU, GPU, RAM);
        this.weight = weight;
        this.accumulator = accumulator;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAccumulator() {
        return accumulator;
    }

    public void setAccumulator(int accumulator) {
        this.accumulator = accumulator;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "weight=" + weight +
                ", accumulator=" + accumulator +
                '}';
    }
}
