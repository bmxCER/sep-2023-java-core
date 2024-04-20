package hw2.part2;

public class Workstation extends Laptop{
    private boolean isitworkstation;

    public Workstation(String CPU, String GPU, String RAM, int weight, int accumulator, boolean isitworkstation) {
        super(CPU, GPU, RAM, weight, accumulator);
        this.isitworkstation = isitworkstation;
    }

    public boolean isIsitworkstation() {
        return isitworkstation;
    }

    public void setIsitworkstation(boolean isitworkstation) {
        this.isitworkstation = isitworkstation;
    }

    @Override
    public String toString() {
        return "Workstation{" +
                "isitworkstation=" + isitworkstation +
                '}';
    }
}
